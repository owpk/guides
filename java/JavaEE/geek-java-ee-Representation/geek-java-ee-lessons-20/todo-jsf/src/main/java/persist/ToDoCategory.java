package persist;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Table(name = "todo_categories")
@Entity
public class ToDoCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 4096, nullable = false)
    private String name;

    @OneToMany(
            mappedBy = "toDoCategory",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ToDo> todos;

    public ToDoCategory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ToDo> getTodos() {
        return todos;
    }

    public void setTodos(List<ToDo> todos) {
        this.todos = todos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoCategory that = (ToDoCategory) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
