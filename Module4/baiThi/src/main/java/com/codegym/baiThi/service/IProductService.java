package com.codegym.baiThi.service;

import com.codegym.baiThi.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();

    Page<Product> findAll(Pageable pageInfo);

    List<Product> search(String keyword);

    Page<Product> search(String keyword, Pageable pageInfo);

    Optional<Product> findOne(Long id);

    Product save(Product product);

    List<Product> save(List<Product> products);

    boolean exists(Long id);

    List<Product> findAll(List<Long> ids);

    long count();

    void delete(Long id);

    void delete(Product product);

    void delete(List<Product> products);

    void deleteAll();
}
