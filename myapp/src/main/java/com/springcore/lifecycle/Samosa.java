package com.springcore.lifecycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting price");
        this.price = price;
    }

    public void init() {
        System.out.println("Inside Init method");
    }


    @Override
    public String toString() {
        return "Samosa [price=" + price + "]";
    }

    public void destory() {
        System.out.println("Inside destroy method");
    }    
}
