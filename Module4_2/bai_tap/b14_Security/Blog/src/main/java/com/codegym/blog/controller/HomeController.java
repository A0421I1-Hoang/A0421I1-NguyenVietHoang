package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    private BlogService blogService;

    @GetMapping("")
    public String home(){
        return "home";
    }

    @GetMapping("/index")
    public ModelAndView showList(@PageableDefault(size = 5) Pageable pageable, @RequestParam("search") Optional<String> search, Model model){
        Page<Blog> blogs;
        if (search.isPresent()){
            blogs = blogService.findAllByNameContainingOrAndTypeBlogName(search.get(), search.get(), pageable);
            model.addAttribute("search", search.get());
        } else {
            blogs = blogService.findAll(pageable);
        }
        return new ModelAndView("index", "blog", blogs);
    }
}
