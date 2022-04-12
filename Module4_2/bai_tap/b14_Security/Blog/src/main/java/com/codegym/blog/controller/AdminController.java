package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.TypeBlog;
import com.codegym.blog.service.TypeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private TypeBlogService typeBlogService;

    @GetMapping("listType")
    public ModelAndView showTypeList(){
        return new ModelAndView("listType", "typeList", typeBlogService.findAll());
    }

    @GetMapping("createType")
    public String showCreateBlog(Model model){
        model.addAttribute("typeBlog", new TypeBlog());
        return "createType";
    }

    @PostMapping("save")
    public String save(@Valid @ModelAttribute TypeBlog typeBlog, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            return "createType";
        } else {
            typeBlogService.save(typeBlog);
            redirectAttributes.addFlashAttribute("success", "Create new type blog success");
            return "redirect:/admin/listType";
        }
    }

    @GetMapping("/{id}/viewType")
    public String view(@PathVariable Long id, Model model){
        model.addAttribute("typeBlog", typeBlogService.findById(id));
        return "viewType";
    }

    @GetMapping("/{id}/deleteType")
    public String showDeleteForm(@PathVariable Long id, Model model){
        model.addAttribute("typeBlog", typeBlogService.findById(id));
        return "deleteType";
    }

    @PostMapping("delete")
    public String delete(Long id, RedirectAttributes redirectAttributes){
        typeBlogService.delete(id);
        redirectAttributes.addAttribute("success", "Delete type blog success");
        return "redirect:/admin/listType";
    }

    @GetMapping("/{id}/editType")
    public String showEditForm(@PathVariable Long id, Model model){
        model.addAttribute("typeBlog", typeBlogService.findById(id));
        return "editType";
    }

    @PostMapping("update")
    public String update(TypeBlog typeBlog, RedirectAttributes redirectAttributes){
        typeBlogService.save(typeBlog);
        redirectAttributes.addAttribute("success", "Edit type blog success");
        return "redirect:/admin/listType";
    }
}
