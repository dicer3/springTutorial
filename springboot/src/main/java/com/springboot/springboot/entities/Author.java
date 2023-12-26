package com.springboot.springboot.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;
    @Column(name="first_name")
    private String firstName;
    private String lastName;
    private String langauge;
    public int getAuthorId() {
        return authorId;
    }
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLangauge() {
        return langauge;
    }
    public void setLangauge(String langauge) {
        this.langauge = langauge;
    }
    @Override
    public String toString() {
        return "Author [authorId=" + authorId + ", firstName=" + firstName + ", lastName=" + lastName + ", langauge="
                + langauge + "]";
    }

    
}
