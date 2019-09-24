package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.repository.query.Query;
import com.devincubator.project.dits.pojo.entity.Question;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionRepository implements Repo<Question> {

    //Abstrcat Repo
//    public QuestionRepository() {
//        super(QuestionRepository.class);
//    }

    @Override
    public List<Question> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_QUESTION.getQuery(), Question.class)
                .list();
    }
}
