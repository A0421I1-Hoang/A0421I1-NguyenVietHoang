package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("")
    public ModelAndView showList(){
        return new ModelAndView("index", "blog", blogService.findAll());
    }

    @GetMapping("create")
    public String showCreateBlog(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("save")
    public String save(Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addAttribute("success", "Create new blog success");
        return "redirect:/";
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
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model){
        model.addAttribute("blog", blogService.findById(id));
        return "edit";
    }

    @PostMapping("update")
    public String update(Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addAttribute("success", "Edit blog success");
        return "redirect:/";
    }
}
