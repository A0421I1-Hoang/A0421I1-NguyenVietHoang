package com.codegym.baiThi.repository;


import com.codegym.baiThi.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    Iterable<Product> findAllByNameContainingOrPriceContaining(String name, String status);

    Page<Product> findAllByNameContainingOrPriceContaining(String name, String status, Pageable pageInfo);
}
