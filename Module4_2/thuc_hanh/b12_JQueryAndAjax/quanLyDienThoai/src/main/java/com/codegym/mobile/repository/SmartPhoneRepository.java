package com.codegym.mobile.repository;

import com.codegym.mobile.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmartPhoneRepository extends JpaRepository<Smartphone, Long> {
}
