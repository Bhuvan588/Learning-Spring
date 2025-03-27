package com.example.springboot.demo.myapp;

import org.springframework.stereotype.Component;

@Component
public class PhpInstructor implements Instructor{

    public PhpInstructor() {
        System.out.println("PhpInstructor initialized!!");
    }

    @Override
    public String getProgrammingExercises() {
        return "Hello from php instructor";
    }
}
