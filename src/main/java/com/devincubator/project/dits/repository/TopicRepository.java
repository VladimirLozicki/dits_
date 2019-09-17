package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.pojo.entity.Topic;
import com.devincubator.project.dits.repository.query.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * @author roma.zamoiski@gmail.com
 */
public class TopicRepository implements Repository<Topic> {

    @Override
    public List<Topic> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_TOPIC.getQuery(), Topic.class)
                .list();
    }
}
