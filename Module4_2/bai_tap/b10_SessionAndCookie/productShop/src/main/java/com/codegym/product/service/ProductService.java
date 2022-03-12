package com.codegym.product.service;

import com.codegym.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    Page<Product> findAllByNameContaining(String name, Pageable pageable);

    void save(Product product);

    void delete(Long id);

    Product findById(Long id);
}
