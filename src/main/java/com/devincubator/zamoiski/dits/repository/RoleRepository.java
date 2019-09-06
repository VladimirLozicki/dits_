package com.devincubator.zamoiski.dits.repository;

import com.devincubator.zamoiski.dits.pojo.entity.Role;
import com.devincubator.zamoiski.dits.repository.query.Query;
import org.hibernate.Session;

import java.util.List;

public class RoleRepository implements Repository<Role> {

    @Override
    public List<Role> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_ROLE.getQuery(), Role.class)
                .list();
    }
}
