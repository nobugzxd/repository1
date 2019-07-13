package com.itcast.service.impl;

import com.itcast.dao.ProductMapper;
import com.itcast.domain.Product;
import com.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }
}
