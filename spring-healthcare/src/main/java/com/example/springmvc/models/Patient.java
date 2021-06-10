package com.example.springmvc.models;

public class Patient {

    private String firstName;
    private String lastName;
    private String SSN;
    private String phoneNumber;
    private String desc;
    private int age;

    public Patient() {}

    public Patient(String firstName, String lastName, String SSN, String phoneNumber, String desc, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.phoneNumber = phoneNumber;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
