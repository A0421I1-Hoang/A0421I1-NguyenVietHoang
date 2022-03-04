package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findAllByNameContainingOrAndTypeBlogName(String name, String typeBlogName, Pageable pageable);

    void save(Blog blog);

    void delete(Long id);

    Blog findById(Long id);
}
