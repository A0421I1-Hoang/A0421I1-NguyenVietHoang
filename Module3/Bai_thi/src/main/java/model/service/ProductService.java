package model.service;

import model.bean.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    boolean save(Product product);
    Map<String,String> save1(Product product);
    boolean delete(int id);
    boolean update(int id, Product product);
}
