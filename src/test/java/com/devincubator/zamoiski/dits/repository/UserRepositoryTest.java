package com.devincubator.zamoiski.dits.repository;

import com.devincubator.project.dits.pojo.entity.User;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserRepositoryTest {

    private User user;

    @BeforeTest
    public void initUser(){
        User user = new User();
        user.setLogin("rz");
        user.setPassword(556);
        this.user = user;
    }

    @Test
    public void testGetUserByLoginAndPassword() {

    }
}