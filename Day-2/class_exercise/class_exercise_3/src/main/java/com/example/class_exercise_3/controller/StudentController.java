package com.example.class_exercise_3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_3.model.Student;

// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class StudentController {



    @PostMapping("/students")
    public Student postMethodName() {
  
        return s;
    }
    
     
     
     
}





