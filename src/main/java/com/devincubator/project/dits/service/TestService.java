package com.devincubator.project.dits.service;


import com.devincubator.project.dits.pojo.entity.Test;
import com.devincubator.project.dits.repository.TestRepository;
import com.devincubator.project.dits.repository.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    @Transactional
    public void create(Test tests){
        testRepository.create(tests);
    }

    @Transactional
    public List<Test> read() {
        return testRepository.getBeanToBeAutowired().getCurrentSession()
                .createQuery(Query.SELECT_TEST.getQuery(), Test.class)
                .list();
    }
}
