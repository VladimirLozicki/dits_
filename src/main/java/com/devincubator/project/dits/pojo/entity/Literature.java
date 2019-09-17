package com.devincubator.project.dits.pojo.entity;

import javax.persistence.*;

/**
 * @author roma.zamoiski@gmail.com
 */
@Entity
public class Literature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long literatureId;

    @Column
    private String decription;

    @OneToOne
    private Question question;

    public Literature() {
    }

    public Literature(String decription, Question question) {
        this.decription = decription;
        this.question = question;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
