package com.app.springsecurity.controllers;

import com.app.springsecurity.Service.UserService;
import com.app.springsecurity.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // all users
    @GetMapping("/")
    public List<User> getAllUsers()
    {
        System.out.println("here !!! ***");
        return this.userService.getAllUsers();
    }

    //return single user
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username1) {
        return this.userService.getUser(username1);
    }

    @PostMapping("/")
    public User add(@RequestBody User user) {
         return this.userService.addUser(user);
    }

}
