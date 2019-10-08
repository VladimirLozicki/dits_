package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.pojo.entity.Answer;
import com.devincubator.project.dits.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnswerRepository implements Repo<Answer> {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public SessionFactory getBeanToBeAutowired() {
        return sessionFactory;
    }

    @Override
    public List<Answer> read() {

        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_ANSWER.getQuery(), Answer.class)
                .list();
    }
}
