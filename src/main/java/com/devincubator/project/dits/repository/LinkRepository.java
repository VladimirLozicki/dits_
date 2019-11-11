package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.pojo.entity.Link;
import com.devincubator.project.dits.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LinkRepository implements Repo<Link> {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public SessionFactory getBeanToBeAutowired() {
        return sessionFactory;
    }

    @Override
    public List<Link> read() {
        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_LINK.getQuery(), Link.class)
                .list();
    }
}
