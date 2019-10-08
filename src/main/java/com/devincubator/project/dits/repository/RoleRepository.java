package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.pojo.entity.Role;
import com.devincubator.project.dits.repository.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class RoleRepository implements Repo<Role> {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public SessionFactory getBeanToBeAutowired() {
        return sessionFactory;
    }

    @Override
    @Transactional
    public List<Role> read() {

        return sessionFactory.getCurrentSession()
                .createQuery(Query.SELECT_ROLE.getQuery(), Role.class)
                .list();
    }
}
