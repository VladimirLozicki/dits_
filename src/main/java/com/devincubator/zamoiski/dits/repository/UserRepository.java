package com.devincubator.zamoiski.dits.repository;

import com.devincubator.zamoiski.dits.pojo.entity.User;
import com.devincubator.zamoiski.dits.repository.query.Query;
import org.hibernate.Session;

import java.util.List;

public class UserRepository implements Repository<User> {

    @Override
    public List<User> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_USER.getQuery(), User.class)
                .list();
    }
}
