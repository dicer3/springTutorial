package com.springcore.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Example {
    
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Example [subject=" + subject + "]";
    }

    @PostConstruct
    public void start() {
        System.out.println("in start");
    }

    @PreDestroy
    public void end() {
        System.out.println("in end");
    }
    
}
