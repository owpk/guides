package com.example.playground;

public enum Genders {
    MALE("male"),
    FEMALE("female"),
    OTHER("other");

    private String gender;

    private Genders(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }
}
