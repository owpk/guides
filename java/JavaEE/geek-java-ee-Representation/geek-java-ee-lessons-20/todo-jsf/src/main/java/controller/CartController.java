package controller;

import service.CartService;
import service.ToDoRepr;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@SessionScoped
@Named
public class CartController implements Serializable {

    @EJB
    private CartService cartService;

    public List<ToDoRepr> getAllToDo() {
        return cartService.getAll();
    }

    public void add(ToDoRepr toDoRepr) {
        cartService.add(toDoRepr);
    }

}
