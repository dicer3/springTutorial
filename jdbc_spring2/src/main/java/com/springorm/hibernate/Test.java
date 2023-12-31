package com.springorm.hibernate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.hibernate.dao.StudentDao;
import com.springorm.hibernate.entities.Answer;
import com.springorm.hibernate.entities.Certificate;
import com.springorm.hibernate.entities.Emp;
import com.springorm.hibernate.entities.Project;
import com.springorm.hibernate.entities.Question;
import com.springorm.hibernate.entities.Student;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/hibernate/config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        // Student student1 = new Student();
        // student1.setStudentId(14134);
        // student1.setStudentName("Ankit Tiwari");
        // student1.setStudentCity("LKO");

        // Certificate cert = new Certificate();
        // cert.setCourse("Andriod");
        // cert.setDuration("2 months");
        // student1.setCerti(cert);

        // Student student2 = new Student();
        // student2.setStudentId(1212);
        // student2.setStudentName("ravi Tiwariee");
        // student2.setStudentCity("delhi");

        // Certificate cert2 = new Certificate();
        // cert2.setCourse("hibernate");
        // cert2.setDuration("1.5 months");
        // student2.setCerti(cert2);

        // int r = studentDao.insert(student1);
        // System.out.println("done "+r);

        // int r2 = studentDao.insert(student2);
        // System.out.println("done "+r2);

        // Question q1 = new Question();
        // q1.setQuestionId(1212);
        // q1.setQuestion("what is java ?");

        // Answer a1 = new Answer();
        // a1.setAnswerId(357);
        // a1.setAnswer("with the help of java we can create softwares");
        // a1.setQuestion(q1);

        // Answer a2 = new Answer();
        // a2.setAnswerId(33);
        // a2.setAnswer("Java is a Prog Language");
        // a2.setQuestion(q1);

        // Answer a3 = new Answer();
        // a3.setAnswerId(142);
        // a3.setAnswer("java has different type of frameworks");
        // a3.setQuestion(q1);

        // q1.setAnswer(Arrays.asList(a1,a2,a3));
        // Question q2 = new Question();
        // q2.setQuestionId(242);
        // q2.setQuestion("what is collection framework !!");

        // Answer a2 = new Answer();
        // a2.setAnswerId(354);
        // a2.setAnswer("api to work with objects in java");

        // q2.setAnswer(a2);

        //studentDao.insertAnswer(a1);
        // studentDao.insertAnswer(a2);

        // studentDao.insertQuestion(q1);
        // studentDao.insertAnswer(a1);
        // studentDao.insertAnswer(a2);
        // studentDao.insertAnswer(a3);

        // studentDao.insertQuestion(q2);

        Emp e1 = new Emp();
        Emp e2 = new Emp();

        e1.setEid(34);
        e1.setName("Ram");

        e2.setEid(35);
        e2.setName("Shyam");

        Project p1 = new Project();
        Project p2 = new Project();
        p1.setPid(12121);
        p1.setProjectName("Library Managment System");

        p2.setPid(14214);
        p2.setProjectName("Chatbot");

        List<Emp> list1 = new ArrayList<>();
        List<Project> list2 = new ArrayList<>();

        list1.add(e1);
        list1.add(e2);

        list2.add(p1);
        list2.add(p2);

        e1.setProjects(list2);
        p2.setEmps(list1);

        studentDao.insertProject(p1);
        studentDao.insertProject(p2);

        studentDao.insertEmp(e1);
        studentDao.insertEmp(e2);

    }
}
