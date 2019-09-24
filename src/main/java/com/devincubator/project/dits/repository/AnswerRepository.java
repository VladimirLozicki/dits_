package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.repository.query.Query;
import com.devincubator.project.dits.pojo.entity.Answer;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class AnswerRepository implements Repo<Answer> {

    @Override
    public List<Answer> read(Session session) {

        session.beginTransaction();
        return session
                    .createQuery(Query.SELECT_ANSWER.getQuery(), Answer.class)
                    .list();
    }
}
