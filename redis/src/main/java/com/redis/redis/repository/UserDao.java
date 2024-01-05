package com.redis.redis.repository;

import java.util.List;

import com.redis.redis.model.User;

public interface UserDao {

    boolean saveUser(User user);

    List<User> fetchAllUser();



    
}
