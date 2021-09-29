package service;

import javax.ejb.Stateful;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Stateful
public class CartService implements Serializable {

    private List<ToDoRepr> todos = new ArrayList<>();

    public List<ToDoRepr> getAll() {
        return todos;
    }

    public void add(ToDoRepr todo) {
        todos.add(todo);
    }

}
