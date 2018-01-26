package com.globomart.catalogueservice.controller;


import com.globomart.catalogueservice.model.Product;
import com.globomart.catalogueservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/api")
@RestController
public class CatalogueServiceController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/products")
    public List<Product> getAll() {
        return  repository.findAll();
    }

    @GetMapping("/products/{type}")
    public List<Product> getAllByType(@PathVariable String type) {
        return  repository.findByType(type);
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @PutMapping("/product/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable Long id) {
        return repository.save(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Long id){
        repository.delete(id);
    }
}
