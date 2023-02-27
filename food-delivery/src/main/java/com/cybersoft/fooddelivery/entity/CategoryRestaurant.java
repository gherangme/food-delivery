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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Categorys getCategorys() {
        return categorys;
    }

    public void setCategorys(Categorys categorys) {
        this.categorys = categorys;
    }

    public Restaurants getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Restaurants restaurants) {
        this.restaurants = restaurants;
    }

    public Set<Foods> getFoods() {
        return foods;
    }

    public void setFoods(Set<Foods> foods) {
        this.foods = foods;
    }
}
