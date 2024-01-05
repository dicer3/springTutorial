package com.redis.redis.service;

import java.util.List;

import com.redis.redis.model.User;

public interface UserService {

    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);
    
}
