package com.codegym.i18n.controller;

import com.codegym.i18n.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("")
    public ModelAndView showLoginForm() {
        return new ModelAndView("login", "user", new User());
    }

    @PostMapping("/doLogin")
    public ModelAndView doLogin(User user) {
        if(user.getUsername().equals("admin") && user.getPassword().equals("123456")){
            ModelAndView modelAndView = new ModelAndView("/success");
            modelAndView.addObject("user",user);
            return modelAndView;
        }
        return new ModelAndView("/error");
    }
}
