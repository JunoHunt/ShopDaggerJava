package com.example.shopdaggerjava.interators;

import com.example.shopdaggerjava.classes.Shop;
import com.example.shopdaggerjava.repositories.IShopsRepository;

import java.util.ArrayList;
import java.util.List;

public class MainActivityInteractor implements IMainActivityInteractor {
    private IShopsRepository shopsRepository;

    public MainActivityInteractor(IShopsRepository shopsRepository) {
        this.shopsRepository = shopsRepository;
    }

    @Override
    public List<Shop> getShops() {
        ArrayList<Shop> shops = new ArrayList<>();
        shops.addAll(shopsRepository.getShopsFromWeb());
        shops.addAll(shopsRepository.getShopsFromBd());
        return shops;
    }
}
