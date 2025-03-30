package com.example.springboot.demo.myapp;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PythonInstructor implements Instructor {

    public PythonInstructor() {
        System.out.println("PythonInstructor initialized!!");
    }

    @PostConstruct
    public void initCode()
    {
        System.out.println("Starting custom logic...");
    }

    @PreDestroy
    public void cleanUpCode()
    {
        System.out.println("Cleaning up code....");
    }

    @Override
    public String getProgrammingExercises() {
        return "Hello from Python Instructor!!";
    }
}
