package controller;

import persist.ToDoCategory;
import persist.ToDoCategoryRepository;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@SessionScoped
@Named
public class ToDoCategoryController implements Serializable {

    @EJB
    private ToDoCategoryRepository toDoCategoryRepository;

    private List<ToDoCategory> todoCategories;

    private ToDoCategory toDoCategory;

    public void preloadTodoCategories(ComponentSystemEvent componentSystemEvent) {
        this.todoCategories = toDoCategoryRepository.findAll();
    }

    public ToDoCategory getToDoCategory() {
        return toDoCategory;
    }

    public void setToDoCategory(ToDoCategory toDoCategory) {
        this.toDoCategory = toDoCategory;
    }

    public String createTodoCategory() {
        this.toDoCategory = new ToDoCategory();
        return "/todo_category.xhtml?faces-redirect=true";
    }

    public List<ToDoCategory> getAllTodoCategories() {
        return todoCategories;
    }

    public String editTodoCategory(ToDoCategory toDoCategory) {
        this.toDoCategory = toDoCategory;
        return "/todo_category.xhtml?faces-redirect=true";
    }

    public void deleteTodoCategory(ToDoCategory toDoCategory) {
        toDoCategoryRepository.delete(toDoCategory.getId());
    }

    public String saveTodoCategory() {
        if (toDoCategory.getId() == null) {
            toDoCategoryRepository.insert(toDoCategory);
        } else {
            toDoCategoryRepository.update(toDoCategory);
        }
        return "/todo_categories.xhtml?faces-redirect=true";
    }
}
