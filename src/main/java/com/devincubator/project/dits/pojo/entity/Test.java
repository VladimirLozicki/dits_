package com.devincubator.project.dits.pojo.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Test {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY, generator="purchase_seq")
    @SequenceGenerator(name="purchase_seq", sequenceName="PURCHASE_SEQ")
    @Column
    private Long testId;

    @Column
    private String name;

    @Column
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "topicId")
    private Topic topic;

    @OneToMany(mappedBy = "test", fetch = FetchType.EAGER)
    private List<Question> questions;

    public Test() {
    }

    public Test(String name, String description, Topic topic) {
        this.name = name;
        this.description = description;
        this.topic = topic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(testId, test.testId) &&
                Objects.equals(name, test.name) &&
                Objects.equals(description, test.description) &&
                Objects.equals(topic, test.topic) &&
                Objects.equals(questions, test.questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testId, name, description, topic, questions);
    }

    @Override
    public String toString() {
        return "Test{" +
                "testId=" + testId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", topic=" + topic +
                ", questions=" + questions +
                '}';
    }
}
