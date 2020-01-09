package com.example.shopdaggerjava.classes;

import androidx.annotation.NonNull;

public class Shop {
    private String name;
    private int productCount;

    public Shop(String name, int productCount) {
        this.name = name;
        this.productCount = productCount;
    }

    public String getName() {
        return name;
    }

    public int getProductCount() {
        return productCount;
    }

    @NonNull
    @Override
    public String toString() {
        return name+" with "+String.valueOf(productCount)+" products";
    }
}
