package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.TypeBlog;
import com.codegym.blog.service.BlogService;
import com.codegym.blog.service.TypeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @Autowired
    private TypeBlogService typeBlogService;

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

    @GetMapping("create")
    public String showCreateBlog(Model model){
        model.addAttribute("blog", new Blog());
        List<TypeBlog> typeBlogs = typeBlogService.findAll();
        model.addAttribute("typeBlog", typeBlogs);
        return "create";
    }

    @PostMapping("save")
    public String save(@Valid @ModelAttribute Blog blog,BindingResult bindingResult, RedirectAttributes redirectAttributes,  Model model){
        if (bindingResult.hasErrors()){
            List<TypeBlog> typeBlogs = typeBlogService.findAll();
            model.addAttribute("typeBlog", typeBlogs);
            return "create";
        } else {
            blogService.save(blog);
            redirectAttributes.addFlashAttribute("success", "Create new blog success");
            return "redirect:/index";
        }
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable Long id, Model model){
        model.addAttribute("blog", blogService.findById(id));
        return "view";
    }

    @GetMapping("/{id}/delete")
    public String showDeleteForm(@PathVariable Long id, Model model){
        model.addAttribute("blog", blogService.findById(id));
        return "delete";
    }

    @PostMapping("delete")
    public String delete(Long id, RedirectAttributes redirectAttributes){
        blogService.delete(id);
        redirectAttributes.addAttribute("success", "Delete blog success");
        return "redirect:/index";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model){
        model.addAttribute("blog", blogService.findById(id));
        List<TypeBlog> typeBlogs = typeBlogService.findAll();
        model.addAttribute("typeBlog", typeBlogs);
        return "edit";
    }

    @PostMapping("update")
    public String update(Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addAttribute("success", "Edit blog success");
        return "redirect:/index";
    }
}
