package com.example.springboot.demo.myapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    private Instructor myInstructor;


    //Setter injection
//    @Autowired
//    public void setInstructor(Instructor instructor)
//    {
//        myInstructor=instructor;
//    }

    @Autowired
    public CourseController(@Qualifier("pythonInstructor")Instructor myInstructor) {
        System.out.println("Hello from Course Controller!!");
        this.myInstructor = myInstructor;
    }

    @GetMapping("/programmingexercise")
    public String getProgrammingExercises()
    {
        return myInstructor.getProgrammingExercises();
    }
}
