package com.springorm.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.hibernate.dao.StudentDao;
import com.springorm.hibernate.entities.Certificate;
import com.springorm.hibernate.entities.Student;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/hibernate/config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        Student student1 = new Student();
        student1.setStudentId(14134);
        student1.setStudentName("Ankit Tiwari");
        student1.setStudentCity("LKO");

        Certificate cert = new Certificate();
        cert.setCourse("Andriod");
        cert.setDuration("2 months");
        student1.setCerti(cert);

        Student student2 = new Student();
        student2.setStudentId(1212);
        student2.setStudentName("ravi Tiwariee");
        student2.setStudentCity("delhi");

        Certificate cert2 = new Certificate();
        cert2.setCourse("hibernate");
        cert2.setDuration("1.5 months");
        student2.setCerti(cert2);

        int r = studentDao.insert(student1);
        System.out.println("done "+r);

        int r2 = studentDao.insert(student2);
        System.out.println("done "+r2);
    }
}
