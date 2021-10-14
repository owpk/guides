package org.owpk.validating;

public class MockPerson {
    private String name;
    private String email;

    public MockPerson(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public MockPerson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "MockPerson{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}