package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.repository.query.Query;
import com.devincubator.project.dits.pojo.entity.Answer;
import org.hibernate.Session;

import java.util.List;

/**
 * @author roma.zamoiski@gmail.com
 */
public class AnswerRepository implements Repository<Answer> {

    @Override
    public List<Answer> read(Session session) {

        session.beginTransaction();
        return session
                    .createQuery(Query.SELECT_ANSWER.getQuery(), Answer.class)
                    .list();
    }
}
