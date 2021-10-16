package com.demo.graphql.service;

import com.demo.graphql.model.Product;
import com.demo.graphql.repository.ProductRepository;
import com.demo.graphql.views.ProductView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductView> findAllProducts(){
        return productRepository.findAll()
                .stream()
                .map(Product::toView)
                .collect(Collectors.toList());
    }
}
