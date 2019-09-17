package com.devincubator.project.dits.repository;

import com.devincubator.project.dits.repository.query.Query;
import com.devincubator.project.dits.pojo.entity.Role;
import org.hibernate.Session;

import java.util.List;

/**
 * @author roma.zamoiski@gmail.com
 */
public class RoleRepository implements Repository<Role> {

    @Override
    public List<Role> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_ROLE.getQuery(), Role.class)
                .list();
    }
}
