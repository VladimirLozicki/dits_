package com.devincubator.zamoiski.dits.repository;

import com.devincubator.zamoiski.dits.pojo.entity.Topic;
import com.devincubator.zamoiski.dits.repository.query.Query;
import org.hibernate.Session;

import java.util.List;

public class TopicRepository implements Repository<Topic> {

    @Override
    public List<Topic> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_TOPIC.getQuery(), Topic.class)
                .list();
    }
}
