package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Set;

@Entity(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "total_price")
    private DecimalFormat totalPrice;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @Column(name = "create_date")
    private Timestamp creatDate;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "orders")
    private Set<RatingOrder> ratingOrders;
}
