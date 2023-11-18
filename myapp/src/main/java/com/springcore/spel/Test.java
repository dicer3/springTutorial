package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
        Demo d1 = con.getBean("demo", Demo.class);

        System.out.println(d1);
    }
}
