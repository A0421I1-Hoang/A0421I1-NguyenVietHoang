package com.codegym.signup.service;

import com.codegym.signup.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IUserService {
    List<User> findAll();

    void save (User user);

    void delete (Long id);

    User findById(Long id);

}
