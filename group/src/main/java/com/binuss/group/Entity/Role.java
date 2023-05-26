package com.binuss.group.Entity;

import Enumeration.RoleName;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_role")
public class Role {
    @Id 
    @SequenceGenerator(name = "id_role", sequenceName = "id_role_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_role")
    private long id;

    @Column(name = "role_name", nullable = false)
    private RoleName roleName;


    public Role() {
    }

    public Role(long id, RoleName roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public RoleName getRoleName() {
        return this.roleName;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }

}
