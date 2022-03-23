package com.codegym.blog.service.impl;

import com.codegym.blog.model.TypeBlog;
import com.codegym.blog.repository.TypeBlogRepository;
import com.codegym.blog.service.TypeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeBlogServiceImpl implements TypeBlogService {
    @Autowired
    private TypeBlogRepository typeBlogRepository;


    @Override
    public List<TypeBlog> findAll() {
        return typeBlogRepository.findAll();
    }

    @Override
    public void save(TypeBlog typeBlog) {
        typeBlogRepository.save(typeBlog);
    }

    @Override
    public void delete(Long id) {
        typeBlogRepository.deleteById(id);
    }

    @Override
    public TypeBlog findById(Long id) {
        return typeBlogRepository.findById(id).orElse(null);
    }
}
