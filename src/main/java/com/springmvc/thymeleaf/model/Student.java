package com.springmvc.thymeleaf.model;

public class Student {
    private String firstName;
    private String lastName;
    private String Country;

    public Student(){}

    public Student(String firstName, String lastName, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        Country = country;
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

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
