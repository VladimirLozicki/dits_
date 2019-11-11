package com.devincubator.project.dits.repository;

import org.hibernate.SessionFactory;

import java.util.List;

public interface Repo<T> {


    SessionFactory getBeanToBeAutowired();

    default void create(T t){
        getBeanToBeAutowired().getCurrentSession().saveOrUpdate(t);
    }

    default void update(T t, SessionFactory sessionFactory){

        sessionFactory.openSession().update(t);
    }

    default void delete(T t, SessionFactory sessionFactory){

        sessionFactory.getCurrentSession()
                .delete(t);
    }

    List<T> read();


}
