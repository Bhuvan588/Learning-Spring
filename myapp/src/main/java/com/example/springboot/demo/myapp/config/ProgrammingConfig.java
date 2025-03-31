package com.example.springboot.demo.myapp.config;

import com.example.springboot.demo.myapp.CInstructor;
import com.example.springboot.demo.myapp.Instructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProgrammingConfig {

    @Bean("CProgram")
    public Instructor cInstructor(){
        return new CInstructor();
    }
}
