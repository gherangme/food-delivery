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
}
