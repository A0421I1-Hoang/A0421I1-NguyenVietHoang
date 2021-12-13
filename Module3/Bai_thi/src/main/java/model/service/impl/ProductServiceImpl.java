package model.service.impl;

import model.bean.Product;
import model.repository.impl.ProductRepositoryImpl;
import model.service.ProductService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    ProductRepositoryImpl productRepository=new ProductRepositoryImpl();
    final String E_REGEX ="^[a-z]{3,20}@[a-z]{3,5}\\.[a-z]{3,5}$";
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public boolean save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Map<String, String> save1(Product product) {
        Map<String,String>map=new HashMap<>();
        productRepository.save(product);
        return map;
    }


    @Override
    public boolean delete(int id) {
        return productRepository.delete(id);
    }

    @Override
    public boolean update(int id, Product product) {
        return productRepository.update(id, product);
    }
}
