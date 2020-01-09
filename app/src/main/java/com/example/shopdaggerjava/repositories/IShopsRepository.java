package com.example.shopdaggerjava.repositories;

import com.example.shopdaggerjava.classes.Shop;

import java.util.List;

public interface IShopsRepository {
    List<Shop> getShopsFromBd();

    List<Shop> getShopsFromWeb();
}
