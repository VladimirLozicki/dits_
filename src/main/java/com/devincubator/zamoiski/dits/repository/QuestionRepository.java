package com.devincubator.zamoiski.dits.repository;

import com.devincubator.zamoiski.dits.pojo.entity.Question;
import com.devincubator.zamoiski.dits.repository.query.Query;
import org.hibernate.Session;

import java.util.List;

public class QuestionRepository implements Repository<Question> {

    @Override
    public List<Question> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_QUESTION.getQuery(), Question.class)
                .list();
    }
}
