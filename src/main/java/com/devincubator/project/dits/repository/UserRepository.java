package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.pojo.entity.User;
import com.devincubator.project.dits.repository.query.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * @author roma.zamoiski@gmail.com
 */
public class UserRepository implements Repository<User> {

    @Override
    public List<User> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_USER.getQuery(), User.class)
                .list();
    }

    public User getUserByLoginAndPassword(User user, Session session){

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_USER_BY_LOGIN_AND_PASSWORD.getQuery(), User.class)
                .getSingleResult();
    }
}
