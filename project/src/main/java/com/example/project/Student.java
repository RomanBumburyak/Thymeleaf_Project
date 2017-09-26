package com.example.project;

public class Student {

    String firstName;
    String lastName;
    Grade grade;


    public Student() {
    }

//    public Student(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }

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

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
