package com.devincubator.project.dits.pojo.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY, generator="purchase_seq")
    @SequenceGenerator(name="purchase_seq", sequenceName="PURCHASE_SEQ")
    @Column
    private Long topicId;

    @Column
    private String description;

    @Column
    private String name;

    @OneToMany(mappedBy = "topic", fetch = FetchType.EAGER)
    private List<Test> tests;

    public Topic() {
    }

    public Topic(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        return Objects.equals(topicId, topic.topicId) &&
                Objects.equals(description, topic.description) &&
                Objects.equals(name, topic.name) &&
                Objects.equals(tests, topic.tests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicId, description, name, tests);
    }
}
