package com.devincubator.project.dits.pojo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long roleId;

    @Column
    private Integer user;

    @Column
    private Integer admin;

    @Column
    private Integer tutor;

    @OneToMany(mappedBy = "role", fetch=FetchType.EAGER)
    private List<User> users;

    public Role() {
    }

    public Role(Integer user, Integer admin, Integer tutor) {
        this.user = user;
        this.admin = admin;
        this.tutor = tutor;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> userConnection) {
        this.users = userConnection;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

    public Integer getTutor() {
        return tutor;
    }

    public void setTutor(Integer tutor) {
        this.tutor = tutor;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
