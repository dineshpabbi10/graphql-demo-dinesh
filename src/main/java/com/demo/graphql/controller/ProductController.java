package com.demo.graphql.controller;

import com.demo.graphql.service.ProductService;
import com.demo.graphql.views.ProductView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("getproducts")
    public List<ProductView> getProducts(){
        return productService.findAllProducts();
    }

}
