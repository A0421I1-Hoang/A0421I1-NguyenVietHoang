package com.codegym.blog.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @NotEmpty
    @Size(min = 5, max = 255)
    private String name;

    @NotEmpty
    @Size(min = 5, max = 255)
    @Column(name = "author")
    private String author;

    @NotEmpty
    @Column(name = "context")
    private String context;

    @ManyToOne(targetEntity = TypeBlog.class)
    private TypeBlog typeBlog;

    public Blog() {}

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public TypeBlog getTypeBlog() {
        return typeBlog;
    }

    public void setTypeBlog(TypeBlog typeBlog) {
        this.typeBlog = typeBlog;
    }
}
