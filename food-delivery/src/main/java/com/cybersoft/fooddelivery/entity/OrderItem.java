package com.cybersoft.fooddelivery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.text.DecimalFormat;

@Entity(name = "orders_item")
public class OrderItem {

    @Id
    private int orderId;
//
//    @Id
//    private int foodId;

    @Column(name = "amount")
    private int amount;

    @Column(name = "price")
    private DecimalFormat price;

}
