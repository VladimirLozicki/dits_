package com.devincubator.project.dits.config;


import com.devincubator.project.dits.pojo.entity.Role;
import com.devincubator.project.dits.service.RoleService;
import com.devincubator.project.dits.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private CustomSuccessHandler customSuccessHandler;
    private UserService userService;
    private PasswordEncoder passwordEncoder;
    private RoleService roleService;

    @Autowired
    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Autowired
    public void setCustomSuccessHandler(CustomSuccessHandler customSuccessHandler) {
        this.customSuccessHandler = customSuccessHandler;
    }

    @Autowired
    public void setUserRepository(UserService userService) {
        this.userService = userService;
    }


    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
       //  auth.inMemoryAuthentication().withUser("user").password("user").roles("USER");
        auth.inMemoryAuthentication()
                .withUser(userService.read().get(0).getLogin())
                .password(userService.read().get(0).getPassword())
                .roles(getRole(roleService.read().get(0)));

        auth.inMemoryAuthentication()
                .withUser(userService.read().get(1).getLogin())
                .password(userService.read().get(1).getPassword())
                .roles(getRole(roleService.read().get(1)));

        auth.inMemoryAuthentication()
                .withUser(userService.read().get(2).getLogin())
                .password(userService.read().get(2).getPassword())
                .roles(getRole(roleService.read().get(2)));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/home").access("hasRole('USER')")
                .antMatchers("/admin/**").access("hasRole('ADMIN')")
                .antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")
                .and().formLogin().loginPage("/login").successHandler(customSuccessHandler)
                .usernameParameter("ssoId").passwordParameter("password")
                .and().csrf()
                .and().exceptionHandling().accessDeniedPage("/Access_Denied");
    }

    public String getRole(Role role) {
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

}
