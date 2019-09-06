package com.devincubator.zamoiski.dits.repository;

import com.devincubator.zamoiski.dits.pojo.entity.Answer;
import com.devincubator.zamoiski.dits.repository.query.Query;
import org.hibernate.Session;

import java.util.List;

public class AnswerRepository implements Repository<Answer> {

    @Override
    public List<Answer> read(Session session) {

        session.beginTransaction();
        return session
                    .createQuery(Query.SELECT_ANSWER.getQuery(), Answer.class)
                    .list();
    }
}
