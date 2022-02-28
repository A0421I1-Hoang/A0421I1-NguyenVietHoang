package com.codegym.baiThi.service;

import com.codegym.baiThi.model.ProductType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IProductTypeService {
    List<ProductType> findAll();

    Optional<ProductType> findOne(Long id);

    ProductType save(ProductType productType);

    List<ProductType> save(List<ProductType> productTypes);

    boolean exists(Long id);

    List<ProductType> findAll(List<Long> ids);

    long count();

    void delete(Long id);

    void delete(ProductType productType);

    void delete(List<ProductType> productTypes);

    void deleteAll();
}
