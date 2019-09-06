package com.devincubator.zamoiski.dits.repository;

import com.devincubator.zamoiski.dits.pojo.entity.Statistic;
import com.devincubator.zamoiski.dits.repository.query.Query;
import org.hibernate.Session;

import java.util.List;

public class StatisticRepository implements Repository<Statistic> {

    @Override
    public List<Statistic> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_STATISTIC.getQuery(), Statistic.class)
                .list();
    }
}
