package com.example.springboot.demo.myapp;


import org.springframework.stereotype.Component;

@Component
public class JavaInstructor  implements Instructor{

    public JavaInstructor() {
        System.out.println("JavaInstructor initialized!!");
    }

    @Override
    public String getProgrammingExercises() {
        return "Write a method which sums 2 numbers";
    }
}
