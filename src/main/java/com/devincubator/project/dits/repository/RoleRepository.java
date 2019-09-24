package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.repository.query.Query;
import com.devincubator.project.dits.pojo.entity.Role;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleRepository implements Repo<Role> {

    @Override
    public List<Role> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_ROLE.getQuery(), Role.class)
                .list();
    }
}
