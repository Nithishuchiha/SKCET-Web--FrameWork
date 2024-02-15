package com.example.class_exercise_3.model;

// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Configuration;/
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;

// import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
public class Student {
     private String name;
     private int age;
     public String getName() {
          return name;
     }
     public void setName(String name) {
          this.name = name;
     }
     public Student(String name, int age) {
          this.name = name;
          this.age = age;
     }
     public int getAge() {
          return age;
     }
     public void setAge(int age) {
          this.age = age;
     }
     
     
}
