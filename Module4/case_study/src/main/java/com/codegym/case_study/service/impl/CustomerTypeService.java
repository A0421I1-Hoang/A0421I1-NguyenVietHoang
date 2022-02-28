package com.codegym.case_study.service.impl;

import com.codegym.case_study.model.CustomerType;
import com.codegym.case_study.repository.CustomerTypeRepository;
import com.codegym.case_study.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return streamAll().collect(Collectors.toList());
    }

    @Override
    public Optional<CustomerType> findOne(Long id) {
        return customerTypeRepository.findById(id);
    }

    @Override
    public CustomerType save(CustomerType customerType) {
        return customerTypeRepository.save(customerType);
    }

    @Override
    public List<CustomerType> save(List<CustomerType> customerTypes) {
        Iterable<CustomerType> updatedProvinces = customerTypeRepository.saveAll(customerTypes);
        return streamAll(updatedProvinces).collect(Collectors.toList());
    }

    private Stream<CustomerType> streamAll(Iterable<CustomerType> customerTypes) {
        return StreamSupport.stream(customerTypes.spliterator(), false);
    }

    @Override
    public boolean exists(Long id) {
        return customerTypeRepository.existsById(id);
    }

    @Override
    public List<CustomerType> findAll(List<Long> ids) {
        Iterable<CustomerType> customerTypes = customerTypeRepository.findAllById(ids);
        return streamAll(customerTypes).collect(Collectors.toList());
    }


    @Override
    public long count() {
        return customerTypeRepository.count();
    }

    @Override
    public void delete(Long id) {
        customerTypeRepository.deleteById(id);
    }

    @Override
    public void delete(CustomerType customerType) {
        customerTypeRepository.delete(customerType);
    }

    @Override
    public void delete(List<CustomerType> customerTypes) {
        customerTypeRepository.deleteAll();
    }

    @Override
    public void deleteAll() {
        customerTypeRepository.deleteAll();
    }

    private Stream<CustomerType> streamAll() {
        return StreamSupport.stream(customerTypeRepository.findAll().spliterator(), false);
    }
}
