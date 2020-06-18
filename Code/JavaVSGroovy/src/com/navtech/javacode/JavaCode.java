package com.navtech.javacode;

import java.util.Date;

public class JavaCode {

    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private Date dob;

    // Default Constructor
    public JavaCode() {

    }

    // Constructor with FirstName, LastName and age
    public JavaCode(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Constructor with FirstName, LastName and dob
    public JavaCode(String firstName, String lastName, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    // Constructor with FirstName, LastName, age and dob
    public JavaCode(String firstName, String lastName, int age, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    public void printFullName() {
        System.out.println("FullName :: " + this.getFirstName() + " " + this.getLastName());
    }

    @Override
    public String toString() {
        return "JavaCode{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
