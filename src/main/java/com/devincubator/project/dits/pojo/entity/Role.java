package com.devincubator.project.dits.pojo.entity;

import javax.persistence.*;

/**
 * @author roma.zamoiski@gmail.com
 */
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long roleId;

    @Column
    private byte[] user;

    @Column
    private byte[] admin;

    @Column
    private byte[] tutor;

    public Role() {
    }

    public Role(byte[] user, byte[] admin, byte[] tutor) {
        this.user = user;
        this.admin = admin;
        this.tutor = tutor;
    }

    public byte[] getUser() {
        return user;
    }

    public void setUser(byte[] user) {
        this.user = user;
    }

    public byte[] getAdmin() {
        return admin;
    }

    public void setAdmin(byte[] admin) {
        this.admin = admin;
    }

    public byte[] getTutor() {
        return tutor;
    }

    public void setTutor(byte[] tutor) {
        this.tutor = tutor;
    }
}
