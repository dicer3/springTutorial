package com.springorm.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Id;

public class Answer {
    @Id
    @Column(name = "answer_id")
    private int answerId;
    private String answer;

    public Answer() {
    }
    public Answer(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public int getAnswerId() {
        return answerId;
    }
    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    
}
