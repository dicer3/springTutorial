package com.springboot.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.springboot.entities.Book;

public interface BookRepository extends CrudRepository< Book ,Integer>{
    public Book findById(int id);

}
