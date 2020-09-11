package com.dineout.code.model.billing;

import java.io.Serializable;

public class DishPrice implements Serializable {
    public String dishName;
    public String price;
    public String estimatedTime;
    public String type;

    public DishPrice() {
    }

    public String getDishname() {
        return dishName;
    }

    public void setDishname(String dishname) {
        this.dishName = dishname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = (price);
    }

    public String getEstimatedtime() {
        return estimatedTime;
    }

    public void setEstimatedtime(String estimatedtime) {
        this.estimatedTime = (estimatedtime);
    }

    public String getTypeofdish() {
        return type;
    }

    public void setTypeofdish(String typeofdish) {
        this.type = typeofdish;
    }

    public DishPrice(String dishname, String price, String estimatedtime, String typeofdish) {

        this.dishName = dishname;
        this.price = price;
        this.estimatedTime = estimatedtime;
        this.type = typeofdish;
    }
}
