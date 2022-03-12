package com.codegym.signup.repository;

import com.codegym.signup.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
