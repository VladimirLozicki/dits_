package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.pojo.entity.Literature;
import com.devincubator.project.dits.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LiteratureRepository implements Repo<Literature> {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public SessionFactory getBeanToBeAutowired() {
        return sessionFactory;
    }

    @Override
    public List<Literature> read() {
        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_LITERATURE.getQuery(), Literature.class)
                .list();
    }
}
