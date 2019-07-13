package com.itcast;

import com.itcast.dao.ProductMapper;
import com.itcast.domain.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test1 {

    @Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContextdao.xml");
        ProductMapper bean = app.getBean(ProductMapper.class);
        List<Product> all = bean.findAll();
        for (Product product : all) {
            System.out.println(product);
        }
    }
}
