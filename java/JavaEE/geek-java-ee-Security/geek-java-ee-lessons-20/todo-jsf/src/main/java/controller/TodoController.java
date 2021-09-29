package controller;

import persist.ToDoCategory;
import persist.ToDoCategoryRepository;
import service.ToDoRepr;
import service.ToDoServiceImpl;
import service.ToDoServiceLocal;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.List;

@SessionScoped
@Named
public class TodoController implements Serializable {

    @EJB
    private ToDoServiceLocal toDoService;

    @EJB
    private ToDoCategoryRepository toDoCategoryRepository;

    private List<ToDoRepr> todos;

    private ToDoRepr toDo;

    public void preloadTodos(ComponentSystemEvent componentSystemEvent) {
        this.todos = toDoService.findAll();
    }

    public ToDoRepr getToDo() {
        return toDo;
    }

    public void setToDo(ToDoRepr toDo) {
        this.toDo = toDo;
    }

    public String createTodo() {
        this.toDo = new ToDoRepr();
        return "/todo.xhtml?faces-redirect=true";
    }

    public List<ToDoRepr> getAllTodos() {
        return todos;
    }

    public String editTodo(ToDoRepr toDo) {
        this.toDo = toDo;
        return "/todo.xhtml?faces-redirect=true";
    }

    public void deleteTodo(ToDoRepr toDo) {
        toDoService.delete(toDo.getId());
    }

    public String saveTodo() {
        if (toDo.getId() == null) {
            toDoService.insert(toDo);
        } else {
            toDoService.update(toDo);
        }
        return "/index.xhtml?faces-redirect=true";
    }

    public List<ToDoCategory> getAllCategories() {
        return toDoCategoryRepository.findAll();
    }

    public String logout() {
        ((HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false)).invalidate();
        return "/index.xhtml?faces-redirect=true";
    }
}
