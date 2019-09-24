package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.repository.query.Query;
import com.devincubator.project.dits.pojo.entity.Literature;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LiteratureRepository implements Repo<Literature> {

    @Override
    public List<Literature> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_LITERATURE.getQuery(), Literature.class)
                .list();
    }
}
