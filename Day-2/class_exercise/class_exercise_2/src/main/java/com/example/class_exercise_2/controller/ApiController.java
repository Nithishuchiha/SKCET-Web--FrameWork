package com.example.class_exercise_2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.config.AppConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation./;


@RestController
public class ApiController {

     @Autowired
     public AppConfig a;
     
     @GetMapping("/student")


     public String getMethodName() {
         return "studentName: "+a.getStudentName()+" age: "+a.getAge();
     }
     
}
