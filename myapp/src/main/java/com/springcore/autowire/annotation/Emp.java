package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("address")
    private Address address;

    public Address getAddress() {
        System.out.println("inside setter method");
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp() {
    }

    public Emp(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        System.out.println("in constructor");
        return "Emp [address=" + address + "]";
    }
    
    
}
