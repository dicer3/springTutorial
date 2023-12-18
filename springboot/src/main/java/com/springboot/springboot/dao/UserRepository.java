package com.springboot.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.springboot.entities.User1;

public interface UserRepository extends CrudRepository<User1, Integer> {
    public List<User1> findByName(String name);

    public List<User1> findByNameAndCity(String name, String city);

    @Query("select u From User1 u")
    public List<User1> getAllUser();

    @Query("select u From User1 u Where u.name = :n and u.city = :c")
    public List<User1> getUserByName(@Param("n") String name,@Param("c") String city);

    @Query(value="select * from user1", nativeQuery = true)
    public List<User1> getAllUsers();
    
}
