package org.owpk;

public class Player {
    private Integer id;
    private Integer age;
    private Role role;
    private String name;

    public class Button {
        private String buttonName;

        public Button(String buttonName) {
            this.buttonName = buttonName;
        }

        public String getButtonName() {
            return buttonName;
        }
        public void setButtonName(String buttonName) {
            this.buttonName = buttonName;
        }

        @Override
        public String toString() {
            return "Button{" +
                    "buttonName='" + buttonName + '\'' +
                    '}';
        }
    }

    void protMethod() {

    }

    public class Switcher {
        private int range;

        public Switcher(int range) {
            this.range = range;
        }

        public int getRange() {
            return range;
        }

        public void setRange(int range) {
            this.range = range;
        }

        @Override
        public String toString() {
            return "Switcher{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", age=" + age +
                ", role=" + role +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
