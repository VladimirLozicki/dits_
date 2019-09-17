package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.repository.query.Query;
import com.devincubator.project.dits.pojo.entity.Link;
import org.hibernate.Session;

import java.util.List;

/**
 * @author roma.zamoiski@gmail.com
 */
public class LinkRepository implements Repository<Link> {

    @Override
    public List<Link> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_LINK.getQuery(), Link.class)
                .list();
    }
}
