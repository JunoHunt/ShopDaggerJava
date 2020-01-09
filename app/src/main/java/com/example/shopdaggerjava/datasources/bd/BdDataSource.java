package com.example.shopdaggerjava.datasources.bd;

import com.example.shopdaggerjava.classes.Shop;

import java.util.ArrayList;
import java.util.List;

public class BdDataSource implements IBdDataSource {
    @Override
    public List<Shop> getShops() {
        ArrayList<Shop> shops = new ArrayList<>();
        shops.add(new Shop("Shop from bd 1", 1));
        shops.add(new Shop("Shop from bd 1", 1));
        return shops;
    }
}
