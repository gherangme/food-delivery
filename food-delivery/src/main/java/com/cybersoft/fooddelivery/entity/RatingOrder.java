package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "rating_order")
public class RatingOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orders;

    @Column(name = "star")
    private int star;

    @Column(name = "comment")
    private String comment;

}
