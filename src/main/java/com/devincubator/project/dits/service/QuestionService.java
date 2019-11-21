package com.devincubator.project.dits.service;

import com.devincubator.project.dits.pojo.entity.Question;
import com.devincubator.project.dits.pojo.entity.Role;
import com.devincubator.project.dits.repository.QuestionRepository;
import com.devincubator.project.dits.repository.RoleRepository;
import com.devincubator.project.dits.repository.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class QuestionService {


    @Autowired
    QuestionRepository questionRepository;

    @Transactional
    public void create(Question question){
        questionRepository.create(question);
    }

    @Transactional
    public List<Question> read() {
        return questionRepository.getBeanToBeAutowired().getCurrentSession()
                .createQuery(Query.SELECT_QUESTION.getQuery(), Question.class)
                .list();
    }
}
