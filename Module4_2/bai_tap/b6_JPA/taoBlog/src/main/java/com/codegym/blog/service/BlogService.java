package com.codegym.blog.service;

import com.codegym.blog.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(Long id);

    Blog findById(Long id);
}
