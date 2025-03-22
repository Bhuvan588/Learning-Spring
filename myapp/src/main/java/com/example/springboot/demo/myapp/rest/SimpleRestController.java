package com.example.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    //add properties for instructor.name and student.class

    @Value("${instructor.name}")
    private String instructorName;

    @Value("${student.name}")
    private String studentName;


    //expose "/" that returns My Application

    @GetMapping("/")
    public String app(){
        return "Hi this is My Application!!";
    }

    @GetMapping("/learning")
    public String getLearningGoals()
    {
        return "Learn 10 modules each day.";
    }

    @GetMapping("/classInfo")
    public String classInfo()
    {
        return "Instructor: " + instructorName + "Student: " + studentName;
    }
}
