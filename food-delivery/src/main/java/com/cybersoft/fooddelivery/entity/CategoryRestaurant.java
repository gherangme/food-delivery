package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "category_restaurant")
public class CategoryRestaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categorys categorys;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurants restaurants;

    @OneToMany(mappedBy = "categoryRestaurant")
    private Set<Foods> foods;
}
