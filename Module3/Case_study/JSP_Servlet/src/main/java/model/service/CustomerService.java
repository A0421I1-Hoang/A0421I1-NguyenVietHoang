package model.service;

import model.bean.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    boolean save(Customer customer);
    Map<String,String> save1(Customer customer);
    boolean delete(int id);
    boolean update(int id, Customer customer);
}
