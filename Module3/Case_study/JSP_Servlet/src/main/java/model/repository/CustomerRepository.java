package model.repository;

import model.bean.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
    Customer findById(int id);
    boolean save(Customer customer);
    boolean delete(int id);
    boolean update(int id, Customer customer);
}
