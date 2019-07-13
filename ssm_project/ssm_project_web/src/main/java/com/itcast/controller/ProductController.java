package com.itcast.controller;

import com.itcast.domain.Product;
import com.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/findAll")
    public ModelAndView findAll(ModelAndView modelAndView){
        List<Product> productList = productService.findAll();
        modelAndView.addObject("productList",productList);
        modelAndView.setViewName("product-list");
        return modelAndView;

    }
}
