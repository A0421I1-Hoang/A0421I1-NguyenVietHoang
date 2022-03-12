package com.codegym.signup.controller;

import com.codegym.signup.model.User;
import com.codegym.signup.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public ModelAndView showList(){
        return new ModelAndView("index", "user", userService.findAll());
    }

    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("user", new User());
        return "create";
    }

    @PostMapping("save")
    public String save(@Valid User user, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if (bindingResult.hasFieldErrors()){
            return "create";
        } else {
            userService.save(user);
            redirectAttributes.addFlashAttribute("success","Create new user success");
            return "redirect:/";
        }
    }
}
