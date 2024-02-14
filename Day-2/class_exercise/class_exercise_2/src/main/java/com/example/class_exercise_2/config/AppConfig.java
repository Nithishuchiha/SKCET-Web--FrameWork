package com.example.class_exercise_2.config;
//
// import org.springframework.beans.factory.annotation.Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppConfig {
     @Value("Nithish")
private String studentName;

@Value("21")
private String age;

public AppConfig(){
     
}
public AppConfig(String studentName, String age) {
     this.studentName = studentName;
     this.age = age;
}
public String getStudentName() {
     return studentName;
}
public void setStudentName(String studentName) {
     this.studentName = studentName;
}
public String getAge() {
     return age;
}
public void setAge(String age) {
     this.age = age;
}





}
