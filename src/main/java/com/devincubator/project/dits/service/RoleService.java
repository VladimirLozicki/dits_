package com.devincubator.project.dits.service;

import com.devincubator.project.dits.pojo.entity.Role;
import com.devincubator.project.dits.pojo.entity.User;
import com.devincubator.project.dits.repository.RoleRepository;
import com.devincubator.project.dits.repository.UserRepository;
import com.devincubator.project.dits.repository.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Transactional
    public void create(Role role){
        roleRepository.create(role);
    }

    @Transactional
    public List<Role> read() {
        return roleRepository.getBeanToBeAutowired().getCurrentSession()
                .createQuery(Query.SELECT_ROLE.getQuery(), Role.class)
                .list();
    }
}
