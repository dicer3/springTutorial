package com.app.springsecurity.Service;

import com.app.springsecurity.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> list = new ArrayList<User>();

    public UserService(){
        list.add(new User("abc","abc","abc@gmail.com"));
        list.add(new User("xyz","xyz","abc@gmail.com"));
    }

    // get all users
    public List<User> getAllUsers(){
        return this.list;
    }

    // get single user
    public User getUser(String username){
        return list.stream().filter(user-> user.getUsername().equals(username)).findAny().orElse(null);
    }

    // add new user
    public User addUser(User user) {
        this.list.add(user);
        return user;
    }
}
