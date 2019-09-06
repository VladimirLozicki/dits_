package com.devincubator.zamoiski.dits.repository;

import com.devincubator.zamoiski.dits.pojo.entity.Test;
import com.devincubator.zamoiski.dits.repository.query.Query;
import org.hibernate.Session;

import java.util.List;

public class TestRepository implements Repository<Test> {

    @Override
    public List<Test> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_TEST.getQuery(), Test.class)
                .list();
    }
}
