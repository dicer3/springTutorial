package com.springjdbc.practice101.entities;

public class Student {
    public int Id;
    public String Name;
    public String city;
    
    public Student() {
    }
    public Student(int id, String name, String city) {
        Id = id;
        Name = name;
        this.city = city;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "Student [Id=" + Id + ", Name=" + Name + ", city=" + city + "]";
    }
}
