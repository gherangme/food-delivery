package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roles;

    @OneToMany(mappedBy = "users")
    private Set<RatingRestaurant> ratingRestaurants;

    @OneToMany(mappedBy = "users")
    private Set<RatingFood> ratingFoods;

    @OneToMany(mappedBy = "users")
    private Set<RatingOrder> ratingOrders;

    @OneToMany(mappedBy = "users")
    private Set<Orders> orders;
}
