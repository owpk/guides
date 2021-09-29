package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import persist.ToDo;
import persist.ToDoCategory;
import persist.ToDoCategoryRepository;
import persist.ToDoRepository;
import rest.ToDoServiceRs;

import javax.ejb.AsyncResult;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;
import javax.jws.WebService;
import java.util.List;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

@Stateless
@WebService(endpointInterface = "service.TodoServiceWs", serviceName = "ToDoService")
public class ToDoServiceImpl implements ToDoServiceLocal, ToDoServiceRemote, TodoServiceWs, ToDoServiceRs {

    private static final Logger logger = LoggerFactory.getLogger(ToDoRepository.class);

    @Inject
    private ToDoRepository toDoRepository;

    @Inject
    private ToDoCategoryRepository toDoCategoryRepository;

    @Override
    @TransactionAttribute
    public void insert(ToDoRepr toDoRepr) {
        ToDoCategory category = toDoCategoryRepository.findById(toDoRepr.getCategoryId());
        toDoRepository.insert(new ToDo(null, toDoRepr.getDescription(), toDoRepr.getTargetDate(), category));
    }

    @Override
    @TransactionAttribute
    public void update(ToDoRepr toDoRepr) {
        ToDoCategory category = toDoCategoryRepository.findById(toDoRepr.getCategoryId());
        toDoRepository.update(new ToDo(toDoRepr.getId(), toDoRepr.getDescription(), toDoRepr.getTargetDate(), category));
    }

    @Override
    @TransactionAttribute
    public void delete(long id) {
        toDoRepository.delete(id);
    }

    @Override
    public ToDoRepr findById(long id) {
        return toDoRepository.findToDoReprById(id);
    }

    @Override
    public List<ToDoRepr> findAll() {
        return toDoRepository.findAllToDoRepr();
    }

    @Override
    public Future<ToDoRepr> findByIdAsync(long id) {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AsyncResult<>(toDoRepository.findToDoReprById(id));
    }

    @Override
    public List<ToDoReprWs> findAllWs() {
        return toDoRepository.findAll().stream().map(ToDoReprWs::new).collect(Collectors.toList());
    }

    @Override
    public ToDoReprWs findByIdWs(long id) {
        return new ToDoReprWs(toDoRepository.findById(id));
    }
}
