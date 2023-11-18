package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {

      @Bean
      public Somosa getSomosa() {
          // creating a new student object
          return new Somosa();
      }
         
      @Bean
      public Student getStudent() {
          // creating a new student object
          return new Student(getSomosa());
      }
}
