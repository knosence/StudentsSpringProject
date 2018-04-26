package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentServices studentServices;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentServices.getStudentList();
    }



}
