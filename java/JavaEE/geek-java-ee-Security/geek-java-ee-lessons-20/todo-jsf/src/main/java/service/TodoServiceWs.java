package service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface TodoServiceWs {

    @WebMethod
    List<ToDoReprWs> findAllWs();

    @WebMethod
    ToDoReprWs findByIdWs(long id);
}
