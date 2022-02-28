package com.codegym.controller;

import com.codegym.model.Mail;
import com.codegym.service.MailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MailController {
    MailService mailService=new MailService();

    @GetMapping("")
    public String list(Model model){
        List<Mail> mailList = mailService.getMailList();
        model.addAttribute("mailList", mailList);
        return "index";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model){
        Mail mail=new Mail();
        model.addAttribute("mail", mail);
        return "create";
    }

    @PostMapping("/create")
    public String showCreateForm(@ModelAttribute Mail mail){
        mailService.saveMail(mail);
        return "redirect:/";

    }
}
