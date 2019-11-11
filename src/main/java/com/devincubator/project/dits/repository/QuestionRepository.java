package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.pojo.entity.Question;
import com.devincubator.project.dits.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionRepository implements Repo<Question> {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public SessionFactory getBeanToBeAutowired() {
        return sessionFactory;
    }

    @Override
    public List<Question> read() {
        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_QUESTION.getQuery(), Question.class)
                .list();
    }
}
