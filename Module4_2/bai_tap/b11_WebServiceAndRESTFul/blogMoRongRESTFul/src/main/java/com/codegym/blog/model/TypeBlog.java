package com.codegym.blog.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TypeBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "type_id")
    private Long id;

    @Column(name = "blog_name")
    private String name;

    @OneToMany(mappedBy = "id")
    private Set<Blog> blogSet;

    public TypeBlog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Blog> getBlogSet() {
        return blogSet;
    }

    public void setBlogSet(Set<Blog> blogSet) {
        this.blogSet = blogSet;
    }
}
