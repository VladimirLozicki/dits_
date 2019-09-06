package com.devincubator.zamoiski.dits.repository;

import com.devincubator.zamoiski.dits.pojo.entity.Link;
import com.devincubator.zamoiski.dits.repository.query.Query;
import org.hibernate.Session;

import java.util.List;

public class LinkRepository implements Repository<Link> {

    @Override
    public List<Link> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_LINK.getQuery(), Link.class)
                .list();
    }
}
