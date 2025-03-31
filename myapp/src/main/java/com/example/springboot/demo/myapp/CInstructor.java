package com.example.springboot.demo.myapp;

public class CInstructor implements Instructor{

    public CInstructor() {
        System.out.println("Hello from C constructor!!");
    }

    @Override
    public String getProgrammingExercises() {
        return "This is a C exercise";
    }
}
