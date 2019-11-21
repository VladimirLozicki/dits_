package com.devincubator.project.dits.pojo.entity;

import javax.persistence.*;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY, generator="purchase_seq")
    @SequenceGenerator(name="purchase_seq", sequenceName="PURCHASE_SEQ")
    @Column
    private Long answerId;

    @Column
    private String description;

    @Column
    private Boolean correct;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "questionId")
    private Question question;

    public Answer() {
    }

    public Answer(String description, Boolean correct, Question question) {
        this.description = description;
        this.correct = correct;
        this.question = question;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
