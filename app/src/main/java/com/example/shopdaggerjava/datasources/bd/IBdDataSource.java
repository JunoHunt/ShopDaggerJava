package com.example.shopdaggerjava.datasources.bd;

import com.example.shopdaggerjava.classes.Shop;

import java.util.List;

public interface IBdDataSource {
    List<Shop> getShops();
}
