package com.springjdbc.practice101.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springjdbc.practice101.entities.Student;

public interface StudentDao {
    public int insert(Student student);
    public int change(Student student);
    public int delete(Student student);
    public Student getStudent(int studentId);

    public List<Student> getAllStudents();
}
