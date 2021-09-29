package service;

import persist.ToDo;

public class ToDoReprWs {

    private Long id;

    private String description;

    public ToDoReprWs() {
    }

    public ToDoReprWs(ToDo toDoRepr) {
        this.id = toDoRepr.getId();
        this.description = toDoRepr.getDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
