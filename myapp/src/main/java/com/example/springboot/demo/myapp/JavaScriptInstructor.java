package com.example.springboot.demo.myapp;


import org.springframework.stereotype.Component;

@Component
public class JavaScriptInstructor implements Instructor {

    public JavaScriptInstructor() {
        System.out.println("JavaScriptInstructor initialized!!");
    }

    @Override
    public String getProgrammingExercises() {
        return "Hello from JS Instructor!!";
    }
}
