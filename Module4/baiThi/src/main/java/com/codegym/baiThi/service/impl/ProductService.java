package com.codegym.baiThi.service.impl;

import com.codegym.baiThi.model.Product;
import com.codegym.baiThi.repository.ProductRepository;
import com.codegym.baiThi.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return streamAll().collect(Collectors.toList());
    }

    @Override
    public Page<Product> findAll(Pageable pageInfo) {
        return productRepository.findAll(pageInfo);
    }

    @Override
    public List<Product> search(String keyword) {
        Iterable<Product> searchResult = productRepository
                .findAllByNameContainingOrPriceContaining(keyword, keyword);
        return streamAll(searchResult).collect(Collectors.toList());

    }

    @Override
    public Page<Product> search(String keyword, Pageable pageInfo) {
        return productRepository
                .findAllByNameContainingOrPriceContaining(keyword, keyword, pageInfo);
    }

    @Override
    public Optional<Product> findOne(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> save(List<Product> products) {
        Iterable<Product> updatedCustomers = productRepository.saveAll(products);
        return streamAll(updatedCustomers).collect(Collectors.toList());
    }

    @Override
    public boolean exists(Long id) {
        return productRepository.existsById(id);
    }

    @Override
    public List<Product> findAll(List<Long> ids) {
        Iterable<Product> products = productRepository.findAllById(ids);
        return streamAll(products).collect(Collectors.toList());
    }

    @Override
    public long count() {
        return productRepository.count();
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }

    @Override
    public void delete(List<Product> products) {
        productRepository.deleteAll(products);
    }

    @Override
    public void deleteAll() {
        productRepository.deleteAll();
    }

    private Stream<Product> streamAll() {
        return StreamSupport.stream(productRepository.findAll().spliterator(), false);
    }

    private Stream<Product> streamAll(Iterable<Product> products) {
        return StreamSupport.stream(products.spliterator(), false);
    }
}
