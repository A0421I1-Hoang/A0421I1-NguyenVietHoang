package com.codegym.mobile.service;

import com.codegym.mobile.model.Smartphone;

import java.util.Optional;

public interface SmartPhoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);
}
