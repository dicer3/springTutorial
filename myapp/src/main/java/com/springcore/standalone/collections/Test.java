package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
        Person person1 = (Person)con.getBean("person1");
        System.out.println(person1);
        System.out.println(person1.getFreinds().getClass().getName());
        System.out.println("------------");
        System.out.println(person1.getFreinds());
        System.out.println(person1.getFeestructure());
        System.out.println(person1.getFeestructure().getClass().getName());
    }
}
