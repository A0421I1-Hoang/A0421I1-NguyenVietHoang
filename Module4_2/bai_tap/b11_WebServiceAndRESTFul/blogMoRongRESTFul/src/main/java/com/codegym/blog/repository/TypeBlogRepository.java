package com.codegym.blog.repository;

import com.codegym.blog.model.TypeBlog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeBlogRepository extends JpaRepository<TypeBlog, Long> {
}
