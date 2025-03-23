package com.example.springboot.demo.myapp;


import org.springframework.stereotype.Component;

@Component
public class JavaInstructor  implements Instructor{

    @Override
    public String getProgrammingExercises() {
        return "Write a method which sums 2 numbers";
    }
}
