package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.pojo.entity.Test;
import com.devincubator.project.dits.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestRepository implements Repo<Test> {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public SessionFactory getBeanToBeAutowired() {
        return sessionFactory;
    }

    @Override
    public List<Test> read() {

        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_TEST.getQuery(), Test.class)
                .list();
    }
}
