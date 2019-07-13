package com.itcast.test1;

import com.itcast.domain.Product;
import com.itcast.service.ProductService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test11 {
    @Test
    public void test111(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContextservice.xml");
        ProductService bean = app.getBean(ProductService.class);
        List<Product> all = bean.findAll();
        for (Product product : all) {
            System.out.println(product);
        }
    }
}
