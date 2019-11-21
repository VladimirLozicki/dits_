package com.devincubator.project.dits.pojo.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "purchase_seq")
    @SequenceGenerator(name = "purchase_seq", sequenceName = "PURCHASE_SEQ")
    @Column
    private Long roleId;

    @Column
    private Integer user;

    @Column
    private Integer admin;

    @Column
    private Integer tutor;

    @OneToMany(mappedBy = "role", fetch = FetchType.EAGER)
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

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", user=" + user +
                ", admin=" + admin +
                ", tutor=" + tutor +
                ", users=" + users +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(roleId, role.roleId) &&
                Objects.equals(user, role.user) &&
                Objects.equals(admin, role.admin) &&
                Objects.equals(tutor, role.tutor) &&
                Objects.equals(users, role.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, user, admin, tutor, users);
    }
}
