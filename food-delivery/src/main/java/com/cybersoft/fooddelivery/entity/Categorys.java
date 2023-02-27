package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "category")
public class Categorys {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String desc;

    @OneToMany(mappedBy = "categorys")
    private Set<CategoryRestaurant> categoryRestaurants;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Set<CategoryRestaurant> getCategoryRestaurants() {
        return categoryRestaurants;
    }

    public void setCategoryRestaurants(Set<CategoryRestaurant> categoryRestaurants) {
        this.categoryRestaurants = categoryRestaurants;
    }
}
