package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.repository.query.Query;
import com.devincubator.project.dits.pojo.entity.Test;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestRepository implements Repo<Test> {

    @Override
    public List<Test> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_TEST.getQuery(), Test.class)
                .list();
    }
}
