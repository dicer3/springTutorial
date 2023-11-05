package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");

       context.registerShutdownHook();
       // Samosa s1 = (Samosa) context.getBean("samosa");
       // System.out.println(s1);

       Example example = (Example) context.getBean("example");
       System.out.println(example);

    }
}
