package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "rating_food")
public class RatingFood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "food_id")
    private Foods foods;

    @Column(name = "star")
    private int star;

    @Column(name = "comment")
    private String comment;

}
