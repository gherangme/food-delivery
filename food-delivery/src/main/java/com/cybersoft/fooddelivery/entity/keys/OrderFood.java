package com.cybersoft.fooddelivery.entity.keys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderFood implements Serializable {

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "food_id")
    private int foodId;

    public OrderFood() {
    }

    public OrderFood(int orderId, int foodId) {
        this.orderId = orderId;
        this.foodId = foodId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }
}
