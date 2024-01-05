package com.redis.redis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.redis.redis.model.User;
import com.redis.redis.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService UserService;

    @PostMapping("/user")
    public ResponseEntity<String> saveUser(@RequestBody User user){
        System.out.println("oming in saveUser");
        boolean result = UserService.saveUser(user);
        if(result)
           return ResponseEntity.ok("User Created Successfully");
        else
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();   

    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> fetchAllUser() {
       List<User> users;
       users = UserService.fetchAllUser();
       return ResponseEntity.ok(users);
    }
}
