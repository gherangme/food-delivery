package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "description")
    private String desc;

    @OneToMany(mappedBy = "roles")
    private Set<Users> users;
}
