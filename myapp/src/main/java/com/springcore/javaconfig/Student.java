package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component("firststudent")
public class Student {

    private Somosa samosa;
    public Student(Somosa samosa) {
        this.samosa = samosa;
    }
    public Somosa getSamosa() {
        return samosa;
    }
    public void setSamosa(Somosa samosa) {
        this.samosa = samosa;
    }
    public void study() {
        this.samosa.display();
        System.out.println("student is studing");
    }
}
