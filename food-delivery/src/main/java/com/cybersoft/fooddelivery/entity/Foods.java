package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;
import java.text.DecimalFormat;
import java.util.Set;

@Entity(name = "food")
public class Foods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String desc;

    @Column(name = "price")
    private DecimalFormat price;

    @Column(name = "instruction")
    private String instruction;

    @ManyToOne
    @JoinColumn(name = "cate_res_id")
    private CategoryRestaurant categoryRestaurant;

    @OneToMany(mappedBy = "foods")
    private Set<RatingFood> ratingFoods;
}
