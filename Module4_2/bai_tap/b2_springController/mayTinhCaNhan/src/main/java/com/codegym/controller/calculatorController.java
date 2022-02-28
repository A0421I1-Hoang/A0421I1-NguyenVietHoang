package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class calculatorController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/calculator")
    public String calculator(@RequestParam String num1, String num2, String add, Model model){
        double result = 0;
        switch (add){
            case "add": result+= Double.parseDouble(num1) + Double.parseDouble(num2); break;
            case "sub": result+= Double.parseDouble(num1) - Double.parseDouble(num2); break;
            case "mul": result+= Double.parseDouble(num1) * Double.parseDouble(num2); break;
            case "div": result+= Double.parseDouble(num1) / Double.parseDouble(num2); break;
            default:
                result=0; break;
        }
        model.addAttribute("result", result);
        return "calculator";
    }
}