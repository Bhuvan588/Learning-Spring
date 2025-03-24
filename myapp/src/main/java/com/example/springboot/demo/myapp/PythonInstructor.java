package com.example.springboot.demo.myapp;

import org.springframework.stereotype.Component;

@Component
public class PythonInstructor implements Instructor {
    @Override
    public String getProgrammingExercises() {
        return "Hello from Python Instructor!!";
    }
}
