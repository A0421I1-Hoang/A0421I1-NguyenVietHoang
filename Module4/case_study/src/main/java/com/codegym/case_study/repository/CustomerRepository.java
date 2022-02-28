package com.codegym.case_study.repository;


import com.codegym.case_study.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByNameContainingOrEmailContaining(String name, String email);

    Page<Customer> findAllByNameContainingOrEmailContaining(String name, String email, Pageable pageInfo);
}
