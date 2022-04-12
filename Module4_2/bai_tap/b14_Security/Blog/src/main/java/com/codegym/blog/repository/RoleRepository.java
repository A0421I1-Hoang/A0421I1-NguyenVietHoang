package com.codegym.blog.repository;

import com.codegym.blog.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Long> {
    Role findByName(String name);
}
