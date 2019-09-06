package com.devincubator.zamoiski.dits.pojo.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Statistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long statisticId;

    @Column
    private Date date;

    @Column
    private Boolean correct;

    @OneToOne
    private Question question;

    @OneToOne
    private User user;

    public Statistic() {
    }

    public Statistic(Date date, Boolean correct, Question question, User user) {
        this.date = date;
        this.correct = correct;
        this.question = question;
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
