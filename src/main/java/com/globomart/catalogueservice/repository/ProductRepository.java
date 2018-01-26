package com.globomart.catalogueservice.repository;

import com.globomart.catalogueservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    public List<Product> findByType(String type);
}
