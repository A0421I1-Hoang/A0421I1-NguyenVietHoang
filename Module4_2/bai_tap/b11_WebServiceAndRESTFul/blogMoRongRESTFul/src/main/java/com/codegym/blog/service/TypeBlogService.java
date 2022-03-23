package com.codegym.blog.service;

import com.codegym.blog.model.TypeBlog;

import java.util.List;

public interface TypeBlogService {
    List<TypeBlog> findAll();

    void save(TypeBlog typeBlog);

    void delete(Long id);

    TypeBlog findById(Long id);
}
