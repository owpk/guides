package service;

import javax.ejb.Asynchronous;
import javax.ejb.Remote;
import java.util.List;
import java.util.concurrent.Future;

@Remote
public interface ToDoServiceRemote {

    List<ToDoRepr> findAll();

    @Asynchronous
    Future<ToDoRepr> findByIdAsync(long id);

}
