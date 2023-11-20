package com.springjdbc.practice101;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.practice101.dao.StudentDao;
import com.springjdbc.practice101.entities.Student;

public class Test {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/practice101/config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);

        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);

        Student student = new Student();
        student.setId(552);
        student.setName("neha");
        student.setCity("kolkata");

        int result = studentDao.insert(student);

        // System.out.println("student added "+result);


        // Student student = new Student();
        // student.setId(456);
        // student.setName("ashish123");
        // student.setCity("palmpur");

        // int result = studentDao.change(student);

        // System.out.println("student updated "+result);

        // Student student = new Student();
        // student.setId(666);

        // int result = studentDao.delete(student);

        // System.out.println("student deleted "+result);

        // Student student = studentDao.getStudent(456);
        // System.out.println(student); 

        List<Student> students = studentDao.getAllStudents();
        for (Student s: students) {
            System.out.println(s);
        }
    }
}
