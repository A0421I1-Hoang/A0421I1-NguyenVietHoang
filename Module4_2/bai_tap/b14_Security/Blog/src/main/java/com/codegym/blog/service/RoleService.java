package com.codegym.blog.service;


import com.codegym.blog.model.Role;

import java.util.List;

public interface RoleService {
    Role findByName(String name);
    List<Role> findAll();
    Role findById(long id);
}
