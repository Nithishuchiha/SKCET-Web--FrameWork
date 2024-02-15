package com.example.class_exercise_4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class BookController {
     
@GetMapping("/path")
public String getMethodName() {
    return new String();
}

     
}
