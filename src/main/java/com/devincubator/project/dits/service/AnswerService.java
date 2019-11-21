package com.devincubator.project.dits.service;

import com.devincubator.project.dits.pojo.entity.Answer;
import com.devincubator.project.dits.pojo.entity.Question;
import com.devincubator.project.dits.repository.AnswerRepository;
import com.devincubator.project.dits.repository.QuestionRepository;
import com.devincubator.project.dits.repository.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AnswerService {
    @Autowired
    AnswerRepository answerRepository;

    @Transactional
    public void create(Answer answer){
        answerRepository.create(answer);
    }

    @Transactional
    public List<Answer> read() {
        return answerRepository.getBeanToBeAutowired().getCurrentSession()
                .createQuery(Query.SELECT_ANSWER.getQuery(), Answer.class)
                .list();
    }
}
