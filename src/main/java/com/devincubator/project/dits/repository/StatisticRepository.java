package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.repository.query.Query;
import com.devincubator.project.dits.pojo.entity.Statistic;
import org.hibernate.Session;

import java.util.List;

/**
 * @author roma.zamoiski@gmail.com
 */
public class StatisticRepository implements Repository<Statistic> {

    @Override
    public List<Statistic> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_STATISTIC.getQuery(), Statistic.class)
                .list();
    }
}
