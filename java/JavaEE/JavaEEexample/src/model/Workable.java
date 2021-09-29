package model;

public class Workable {
    private String name;
    private String pass;
    private String id;

    public Workable(String name, String pass, String id) {
        this.name = name;
        this.pass = pass;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public String getId() {
        return id;
    }
}
