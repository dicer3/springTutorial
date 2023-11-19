package com.springjdbc.practice101;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/practice101/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

        String query = "insert into student(id,name,city) values(?,?,?)";

        template.update(query, 534,"nishu kapoor","nagpur");
        System.out.println("query executed");
    }
}
