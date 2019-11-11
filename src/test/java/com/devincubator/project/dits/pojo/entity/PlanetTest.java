package com.devincubator.project.dits.pojo.entity;

import com.devincubator.project.dits.config.WebAppConfig;
import com.devincubator.project.dits.service.RoleService;
import com.devincubator.project.dits.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


@ComponentScan(basePackages = "com.devincubator.project.dits")
@ContextConfiguration(classes = {WebAppConfig.class})
@PropertySource("classpath:database.properties")
@PropertySource("classpath:hibernate.properties")
@WebAppConfiguration
public class PlanetTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private UserService userService;

    @Autowired
    RoleService roleService;

    @Autowired
    PasswordEncoder passwordEncoder;


    @Ignore
    @Test
    public void testGId() {
        userService.create(registerUser());
        userService.create(registerAdmin());
        userService.create(registerDBA());
    }

    String getRole(Role role) {
        if (role.getUser() == 1) {
            return "USER";
        }
        if (role.getAdmin() == 1) {
            return "ADMIN";
        }
        if (role.getTutor() == 1) {
            return "DBA";
        }
        return "";
    }

     User registerUser() {
        Role role = new Role();
        role.setUser(1);
         role.setTutor(0);
         role.setAdmin(0);
        User user = new User();
        user.setRole(role);
        user.setLogin("vladimir");
        String password = "12345";
        String encryptedPassword = passwordEncoder.encode(password);
        user.setPassword(encryptedPassword);
        return user;
    }

     User registerAdmin() {
        Role role = new Role();
        role.setAdmin(1);
        role.setTutor(0);
        role.setUser(0);
        User user = new User();
        user.setRole(role);
        user.setLogin("yaroslav");
        String password = "12345";
        String encryptedPassword = passwordEncoder.encode(password);
        user.setPassword(encryptedPassword);
        return user;
    }

     User registerDBA() {
        Role role = new Role();
        role.setTutor(1);
         role.setAdmin(0);
         role.setUser(0);
        User user = new User();
        user.setRole(role);
        user.setLogin("roma");
        String password = "12345";
        String encryptedPassword = passwordEncoder.encode(password);
        user.setPassword(encryptedPassword);
        return user;
    }
}