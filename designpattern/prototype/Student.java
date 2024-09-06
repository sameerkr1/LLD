package org.example.designpattern.prototype;

public class Student implements Prototype{

    private String name;
    private int age;
    private String gender;

    Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public Prototype clone() {
        return new Student(name, age, gender);
    }
}
