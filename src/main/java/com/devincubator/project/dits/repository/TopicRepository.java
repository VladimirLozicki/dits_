package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.pojo.entity.Topic;
import com.devincubator.project.dits.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TopicRepository implements Repo<Topic> {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public SessionFactory getBeanToBeAutowired() {
        return sessionFactory;
    }

    @Override
    public List<Topic> read() {
        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_TOPIC.getQuery(), Topic.class)
                .list();
    }
}
