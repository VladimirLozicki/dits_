package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.repository.query.Query;
import com.devincubator.project.dits.pojo.entity.Statistic;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StatisticRepository implements Repo<Statistic> {

    @Override
    public List<Statistic> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_STATISTIC.getQuery(), Statistic.class)
                .list();
    }
}
