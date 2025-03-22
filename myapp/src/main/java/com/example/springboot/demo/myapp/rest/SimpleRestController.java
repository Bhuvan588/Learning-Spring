package com.example.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

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
}
