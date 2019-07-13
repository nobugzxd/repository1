package com.itcast.dao;

import com.itcast.domain.Product;

import java.util.List;

public interface ProductMapper {
    List<Product> findAll();
}
