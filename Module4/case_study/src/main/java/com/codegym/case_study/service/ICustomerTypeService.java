package com.codegym.case_study.service;

import com.codegym.case_study.model.CustomerType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ICustomerTypeService {
    List<CustomerType> findAll();

    Optional<CustomerType> findOne(Long id);

    CustomerType save(CustomerType customerType);

    List<CustomerType> save(List<CustomerType> customerTypes);

    boolean exists(Long id);

    List<CustomerType> findAll(List<Long> ids);

    long count();

    void delete(Long id);

    void delete(CustomerType customerType);

    void delete(List<CustomerType> customerTypes);

    void deleteAll();
}
