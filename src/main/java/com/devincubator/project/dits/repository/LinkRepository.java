package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.repository.query.Query;
import com.devincubator.project.dits.pojo.entity.Link;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LinkRepository implements Repo<Link> {

    @Override
    public List<Link> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_LINK.getQuery(), Link.class)
                .list();
    }
}
