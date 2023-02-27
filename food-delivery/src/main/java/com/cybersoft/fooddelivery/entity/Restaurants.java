package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "restaurant")
public class Restaurants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "adderss")
    private String address;

    @Column(name = "description")
    private String description;

    @Column(name = "rating")
    private int rating;

    @Column(name = "content")
    private String content;

    @OneToMany(mappedBy = "restaurants")
    private Set<RatingRestaurant> ratingRestaurants;

    @OneToMany(mappedBy = "restaurants")
    private Set<CategoryRestaurant> categoryRestaurants;
}
