package com.example.shopdaggerjava.repositories;

import com.example.shopdaggerjava.classes.Shop;
import com.example.shopdaggerjava.datasources.bd.IBdDataSource;
import com.example.shopdaggerjava.datasources.web.IWebDatasource;

import java.util.List;

public class ShopsRepository implements IShopsRepository {
    private IWebDatasource webDataSource;
    private IBdDataSource bdDataSource;

    public ShopsRepository(IWebDatasource webDataSource, IBdDataSource bdDataSource) {
        this.webDataSource = webDataSource;
        this.bdDataSource = bdDataSource;
    }

    @Override
    public List<Shop> getShopsFromBd() {
        return bdDataSource.getShops();
    }

    @Override
    public List<Shop> getShopsFromWeb() {
        return webDataSource.getShops();
    }
}
