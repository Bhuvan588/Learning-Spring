package com.example.springboot.demo.myapp;

import org.springframework.stereotype.Component;

@Component
public class PhpInstructor implements Instructor{
    @Override
    public String getProgrammingExercises() {
        return "Hello from php instructor";
    }
}
