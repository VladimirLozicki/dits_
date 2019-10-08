package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.pojo.entity.User;
import com.devincubator.project.dits.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository implements Repo<User> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public SessionFactory getBeanToBeAutowired() {
        return sessionFactory;
    }

    @Override
    public List<User> read() {

        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_USER.getQuery(), User.class)
                .list();
    }
}
