package com.dineout.code.controller.admin;

public class Item {

    public String name;
    public String price;
    public String quantity;
    public String threshold;


    public Item() {
    }

    public Item(String name, String price, String quantity, String threshold) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.threshold = threshold;
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }


}
