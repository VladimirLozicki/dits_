package com.devincubator.project.dits.pojo.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author roma.zamoiski@gmail.com
 */
@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long topicId;

    @Column
    private String description;

    @Column
    private String name;

    public Topic() {
    }

    public Topic(String description, String name) {
        this.description = description;
        this.name = name;
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

        if (!Objects.equals(topicId, topic.topicId)) return false;
        if (!Objects.equals(description, topic.description)) return false;
        return Objects.equals(name, topic.name);
    }

    @Override
    public int hashCode() {
        int result = topicId != null ? topicId.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
