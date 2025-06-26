package com.mycompany.StudentLoginSystem;

// Inheritance + Polymorphism
public class LoginSystem extends LoginSystemBase {
    private Student[] students;

    public LoginSystem() {
        students = new Student[3];
        students[0] = new GraduateStudent("Ayan Shahid", 124, 1234);
        students[1] = new UndergraduateStudent("Muhammad Hassam", 46, 1234);
        students[2] = new GraduateStudent("Saad Faisal" , 115 , 1234);
    }

    @Override //run time
    public Student verifyLogin(int id, int password) {
        for (Student s : students) {
            if (s.getId() == id && s.getPassword() == password) {
                return s;
            }
        }
        return null;
    }
}
