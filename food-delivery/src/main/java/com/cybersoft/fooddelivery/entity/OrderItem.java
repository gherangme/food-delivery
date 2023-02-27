package com.cybersoft.fooddelivery.entity;

import com.cybersoft.fooddelivery.entity.keys.OrderFood;

import javax.persistence.*;
import java.text.DecimalFormat;

@Entity(name = "orders_item")
public class OrderItem {

    @EmbeddedId
    private OrderFood orderFood;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "food_id", insertable = false, updatable = false)
    private Foods foods;

    @Column(name = "amount")
    private int amount;

    @Column(name = "price")
    private double price;

    public OrderFood getOrderFood() {
        return orderFood;
    }

    public void setOrderFood(OrderFood orderFood) {
        this.orderFood = orderFood;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Foods getFoods() {
        return foods;
    }

    public void setFoods(Foods foods) {
        this.foods = foods;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
