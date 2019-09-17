package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.repository.query.Query;
import com.devincubator.project.dits.pojo.entity.Literature;
import org.hibernate.Session;

import java.util.List;

/**
 * @author roma.zamoiski@gmail.com
 */
public class LiteratureRepository implements Repository<Literature>{

    @Override
    public List<Literature> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_LITERATURE.getQuery(), Literature.class)
                .list();
    }
}
