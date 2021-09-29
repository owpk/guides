package service;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ToDoServiceLocal {

    void insert(ToDoRepr toDoRepr);

    void update(ToDoRepr toDoRepr);

    void delete(long id);

    ToDoRepr findById(long id);

    List<ToDoRepr> findAll();
}
