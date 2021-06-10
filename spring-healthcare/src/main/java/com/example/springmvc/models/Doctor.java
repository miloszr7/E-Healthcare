package com.example.springmvc.models;

public class Doctor {

    private String firstName;
    private String lastName;
    private String title;
    private int age;

    public Doctor() {}

    public Doctor(String firstName, String lastName, String title, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
