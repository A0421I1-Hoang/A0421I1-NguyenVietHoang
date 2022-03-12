package com.example.count.controller;

import com.example.count.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(names = "dem")
public class CountController {

    @ModelAttribute(name = "dem")
    public Counter setUpCounter(){
        return new Counter();
    }

    @GetMapping("")
    public String get(@ModelAttribute("dem") Counter counter){
        counter.increment();
        return "index";
    }
}
