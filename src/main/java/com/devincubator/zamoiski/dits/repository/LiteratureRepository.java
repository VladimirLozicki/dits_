package com.devincubator.zamoiski.dits.repository;

import com.devincubator.zamoiski.dits.pojo.entity.Literature;
import com.devincubator.zamoiski.dits.repository.query.Query;
import org.hibernate.Session;

import java.util.List;

public class LiteratureRepository implements Repository<Literature>{

    @Override
    public List<Literature> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_LITERATURE.getQuery(), Literature.class)
                .list();
    }
}
