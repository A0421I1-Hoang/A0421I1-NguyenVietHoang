package com.codegym.baiThi.service.impl;

import com.codegym.baiThi.model.ProductType;
import com.codegym.baiThi.repository.ProductTypeRepository;
import com.codegym.baiThi.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class ProductTypeService implements IProductTypeService {
    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Override
    public List<ProductType> findAll() {
        return (List<ProductType>) streamAll().collect(Collectors.toList());
    }

    @Override
    public Optional<ProductType> findOne(Long id) {
        return productTypeRepository.findById(id);
    }

    @Override
    public ProductType save(ProductType productType) {
        return productTypeRepository.save(productType);
    }

    @Override
    public List<ProductType> save(List<ProductType> productTypes) {
        Iterable<ProductType> updatedProductType = productTypeRepository.saveAll(productTypes);
        return streamAll(updatedProductType).collect(Collectors.toList());
    }

    private Stream<ProductType> streamAll(Iterable<ProductType> customerTypes) {
        return StreamSupport.stream(customerTypes.spliterator(), false);
    }

    @Override
    public boolean exists(Long id) {
        return productTypeRepository.existsById(id);
    }

    @Override
    public List<ProductType> findAll(List<Long> ids) {
        Iterable<ProductType> productTypes = productTypeRepository.findAllById(ids);
        return streamAll(productTypes).collect(Collectors.toList());
    }


    @Override
    public long count() {
        return productTypeRepository.count();
    }

    @Override
    public void delete(Long id) {
        productTypeRepository.deleteById(id);
    }

    @Override
    public void delete(ProductType productType) {
        productTypeRepository.delete(productType);
    }

    @Override
    public void delete(List<ProductType> productTypes) {
        productTypeRepository.deleteAll();
    }

    @Override
    public void deleteAll() {
        productTypeRepository.deleteAll();
    }

    private Stream streamAll() {
        return StreamSupport.stream(productTypeRepository.findAll().spliterator(), false);
    }
}
