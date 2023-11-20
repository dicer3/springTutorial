package com.springjdbc.practice101.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.springjdbc.practice101.entities.Student;

public class RowMapperImpl implements RowMapper<Student>{

    @Override
    @Nullable
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        // TODO Auto-generated method stub
        //System.out.println("rs "+rs.toString());
       Student student = new Student();
       student.setId(rs.getInt(1));
       student.setName(rs.getString(2));
       student.setCity(rs.getString(3));

       return student;
    }
    
}
