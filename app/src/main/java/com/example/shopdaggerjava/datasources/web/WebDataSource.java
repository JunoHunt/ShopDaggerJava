package com.example.shopdaggerjava.datasources.web;

import com.example.shopdaggerjava.classes.Shop;

import java.util.ArrayList;
import java.util.List;

public class WebDataSource implements IWebDatasource {
    @Override
    public List<Shop> getShops() {
        ArrayList<Shop> shops = new ArrayList<>();
        shops.add(new Shop("Shop from web 1", 1));
        shops.add(new Shop("Shop from web 1", 1));
        return shops;
    }
}
