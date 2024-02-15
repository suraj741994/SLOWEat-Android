package com.example.myfoodapplication;

import java.io.Serializable;
public class CartItem implements Serializable {
    // Your CartItem class implementation


    private String itemName;
    private double itemPrice;

    public CartItem(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}
