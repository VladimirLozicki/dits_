package com.devincubator.project.dits.service;

import com.devincubator.project.dits.pojo.entity.User;
import com.devincubator.project.dits.repository.UserRepository;
import com.devincubator.project.dits.repository.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Transactional
    public void create(User user){
        userRepository.create(user);
    }

    @Transactional
    public List<User> read() {
        return userRepository.getBeanToBeAutowired().getCurrentSession()
                .createQuery(Query.SELECT_USER.getQuery(), User.class)
                .list();
    }
}
