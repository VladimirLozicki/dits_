package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.repository.query.Query;
import com.devincubator.project.dits.pojo.entity.Question;
import org.hibernate.Session;

import java.util.List;

/**
 * @author roma.zamoiski@gmail.com
 */
public class QuestionRepository implements Repository<Question> {

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
