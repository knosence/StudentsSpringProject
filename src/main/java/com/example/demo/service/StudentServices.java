package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentServices {

    private List<Student> studentList = new ArrayList<>();

    public StudentServices() {
        Student student1 = new Student();
        student1.setName("Shahar");
        student1.setAge(24);
        Student student2 = new Student("Victor", 25);
        Student student3 = new Student("Noelle", 24);
        Student student4 = new Student("Mariano", 25);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

    }

    public List<Student> getStudentList() {
        return studentList;
    }


}
