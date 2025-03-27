package com.example.springboot.demo.myapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PythonInstructor implements Instructor {

    public PythonInstructor() {
        System.out.println("PythonInstructor initialized!!");
    }

    @Override
    public String getProgrammingExercises() {
        return "Hello from Python Instructor!!";
    }
}
