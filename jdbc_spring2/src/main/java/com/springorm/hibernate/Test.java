package com.springorm.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.hibernate.dao.StudentDao;
import com.springorm.hibernate.entities.Student;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/hibernate/config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        Student student = new Student(321,"naresh","jalandar");
        int r = studentDao.insert(student);
        System.out.println("done "+r);
    }
}
