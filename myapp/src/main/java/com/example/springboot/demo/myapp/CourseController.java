package com.example.springboot.demo.myapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    private Instructor myInstructor;
    //private Instructor anotherInstructor;



    @Autowired
    public CourseController(@Qualifier("CProgram")Instructor myInstructor) {
        System.out.println("Hello from Course Controller!!");
        this.myInstructor = myInstructor;
        //this.anotherInstructor=anotherInstructor;
    }

    @GetMapping("/programmingexercise")
    public String getProgrammingExercises()
    {
        return myInstructor.getProgrammingExercises();
    }


//    @GetMapping("/check")
//    public String check(){
//        return "Comparing beans: myInstructor==anotherInstructor, " + (myInstructor==anotherInstructor);
//    }
}
