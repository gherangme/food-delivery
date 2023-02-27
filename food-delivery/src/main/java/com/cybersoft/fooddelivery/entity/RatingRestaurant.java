package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "rating_restaurant")
public class RatingRestaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "res_id")
    private Restaurants restaurants;

    @Column(name = "star")
    private int star;

    @Column(name = "comment")
    private String comment;

}
