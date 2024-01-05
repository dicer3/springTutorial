package com.redis.redis.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.redis.redis.model.User;

@Repository
public class UserDaoImpl implements UserDao{

    public static final String KEY = "USER";

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public boolean saveUser(User user) {
       try {
        redisTemplate.opsForHash().put(KEY, user.getId().toString(), user);
        return true;
       } catch(Exception e){
          e.printStackTrace();
          return false;
       }

    }

    @Override
    public List<User> fetchAllUser() {
       List<User> users = redisTemplate.opsForHash().values(KEY);
       return users;
    }
    

}
