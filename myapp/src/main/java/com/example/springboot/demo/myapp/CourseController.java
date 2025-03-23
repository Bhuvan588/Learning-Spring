package com.example.springboot.demo.myapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    private Instructor myInstructor;

    @Autowired
    public CourseController(Instructor myInstructor) {
        this.myInstructor = myInstructor;
    }

    @GetMapping("/programmingexercise")
    public String getProgrammingExercises()
    {
        return myInstructor.getProgrammingExercises();
    }
}
