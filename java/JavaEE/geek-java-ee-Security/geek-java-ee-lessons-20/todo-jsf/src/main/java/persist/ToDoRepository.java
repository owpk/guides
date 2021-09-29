package persist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.ToDoRepr;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ToDoRepository {

    private static final Logger logger = LoggerFactory.getLogger(ToDoRepository.class);

    @PersistenceContext(unitName = "ds")
    private EntityManager em;

    public void insert(ToDo toDo) {
        em.persist(toDo);
    }

    public void update(ToDo toDo) {
        em.merge(toDo);
    }

    public void delete(long id) {
        ToDo toDo = em.find(ToDo.class, id);
        if (toDo != null) {
            em.remove(toDo);
        }
    }

    public ToDo findById(long id) {
        return em.find(ToDo.class, id);
    }

    public ToDoRepr findToDoReprById(long id) {
        return em.createQuery("select new service.ToDoRepr(t.id, t.description, t.targetDate, t.toDoCategory.id, t.toDoCategory.name) from ToDo t where t.id = :id", ToDoRepr.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<ToDo> findAll() {
        return em.createQuery("from ToDo", ToDo.class).getResultList();
    }

    public List<ToDoRepr> findAllToDoRepr() {
        return em.createQuery("select new service.ToDoRepr(t.id, t.description, t.targetDate, t.toDoCategory.id, t.toDoCategory.name) from ToDo t", ToDoRepr.class)
                .getResultList();
    }
}
