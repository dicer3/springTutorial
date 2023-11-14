package com.springcore.autowire;

public class Emp {
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
