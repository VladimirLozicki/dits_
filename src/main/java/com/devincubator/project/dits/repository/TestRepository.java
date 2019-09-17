package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.repository.query.Query;
import com.devincubator.project.dits.pojo.entity.Test;
import org.hibernate.Session;

import java.util.List;

/**
 * @author roma.zamoiski@gmail.com
 */
public class TestRepository implements Repository<Test> {

    @Override
    public List<Test> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_TEST.getQuery(), Test.class)
                .list();
    }
}
