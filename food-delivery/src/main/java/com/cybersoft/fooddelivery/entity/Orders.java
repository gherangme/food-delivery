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
    private double totalPrice;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @Column(name = "create_date")
    private Timestamp creatDate;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "orders")
    private Set<RatingOrder> ratingOrders;

    @OneToMany(mappedBy = "orders")
    private Set<OrderItem> orderItems;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Timestamp getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Timestamp creatDate) {
        this.creatDate = creatDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<RatingOrder> getRatingOrders() {
        return ratingOrders;
    }

    public void setRatingOrders(Set<RatingOrder> ratingOrders) {
        this.ratingOrders = ratingOrders;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
