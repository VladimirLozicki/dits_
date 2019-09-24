package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.pojo.entity.Topic;
import com.devincubator.project.dits.repository.query.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TopicRepository implements Repo<Topic> {

    @Override
    public List<Topic> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_TOPIC.getQuery(), Topic.class)
                .list();
    }
}
