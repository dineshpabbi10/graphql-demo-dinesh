package com.demo.graphql.repository;

import com.demo.graphql.model.Product;
import com.demo.graphql.views.ProductView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    public List<Product> findByProductIdIn(List<Integer> ids);
}
