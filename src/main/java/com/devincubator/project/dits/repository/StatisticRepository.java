package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.pojo.entity.Statistic;
import com.devincubator.project.dits.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StatisticRepository implements Repo<Statistic> {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public SessionFactory getBeanToBeAutowired() {
        return sessionFactory;
    }

    @Override
    public List<Statistic> read() {

        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_STATISTIC.getQuery(), Statistic.class)
                .list();
    }
}
