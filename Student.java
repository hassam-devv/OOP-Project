package com.mycompany.StudentLoginSystem;

// Encapsulation
public class Student {
    private String name;
    private int id;
    private int password;

    public Student(String name, int id, int password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPassword() {
        return password;
    }
}
