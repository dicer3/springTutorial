package com.practice.mongospring.controller;

import com.practice.mongospring.models.Student;
import com.practice.mongospring.rep.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MyController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/")
    public ResponseEntity<?> addSubject(@RequestBody Student student){
        System.out.println("coming here");
        Student save = this.studentRepository.save(student);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/")
    public ResponseEntity<?> getStudents(){

        return ResponseEntity.ok(this.studentRepository.findAll());
    }
}
