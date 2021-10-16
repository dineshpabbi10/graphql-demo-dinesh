package com.demo.graphql.queryresolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.demo.graphql.service.ProductService;
import com.demo.graphql.views.ProductView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductQueryResolver implements GraphQLQueryResolver {

    @Autowired
    ProductService productService;

    public List<ProductView> findAllProducts(){
        return productService.findAllProducts();
    }
}
