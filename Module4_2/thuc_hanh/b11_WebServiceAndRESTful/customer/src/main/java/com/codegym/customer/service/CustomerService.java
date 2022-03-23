package com.codegym.customer.service;

import com.codegym.customer.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();

    Optional<Customer> findById(Long id);

    void save(Customer customer);

    void delete(Long id);
}
