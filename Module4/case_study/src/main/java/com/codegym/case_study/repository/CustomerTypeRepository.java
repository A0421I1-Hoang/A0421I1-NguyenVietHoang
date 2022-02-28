package com.codegym.case_study.repository;

import com.codegym.case_study.model.CustomerType;
import org.springframework.data.repository.CrudRepository;

public interface CustomerTypeRepository extends CrudRepository <CustomerType, Long> {
}
