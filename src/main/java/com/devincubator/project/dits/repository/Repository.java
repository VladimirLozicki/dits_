package com.devincubator.project.dits.repository;

import org.hibernate.Session;

import java.util.List;

/**
 * @author roma.zamoiski@gmail.com
 */
public interface Repository<T> {

    default void create(T t, Session session){

        session.beginTransaction();
        session.save(t);
        session
                .getTransaction()
                .commit();
        session.close();
    }

    default void update(T t, Session session){

        session.beginTransaction();
        session.update(t);
        session
                .getTransaction()
                .commit();
        session.close();
    }

    default void delete(T t, Session session){

        session.beginTransaction();
        session.delete(t);
        session
                .getTransaction()
                .commit();
        session.close();
    }

    List<T> read(Session session);


}
