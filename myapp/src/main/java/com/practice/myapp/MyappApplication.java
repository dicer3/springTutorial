package com.practice.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		System.out.println("before getter bean");
		Student student1 =  (Student) context.getBean("student2");
		System.out.println("fine " + student1);
		System.out.println("pragun");
	}

}
