package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.pojo.entity.User;
import com.devincubator.project.dits.repository.query.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository implements Repo<User> {

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
                .setParameter(1, user.getLogin())
                .setParameter(2, user.getPassword())
                .getSingleResult();
    }

    public User getUserByLogin(String login, Session session) {
        return session
                .createQuery(Query.SELECT_USER_BY_LOGIN.getQuery(), User.class)
                .setParameter("login", login)
                .getSingleResult();
    }

    public User getUserByLogin(User user, Session session){
        return session
                .createQuery(Query.SELECT_USER_BY_LOGIN.getQuery(), User.class)
                .setParameter("login", user.getLogin())
                .getSingleResult();
    }
}
