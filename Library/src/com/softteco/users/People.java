package com.softteco.users;

public abstract class People {
    private String name;
    private String surname;
    private int age;

    protected People(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getSurname() {
        return surname;
    }

    protected void setSurname(String surname) {
        this.surname = surname;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }
}
