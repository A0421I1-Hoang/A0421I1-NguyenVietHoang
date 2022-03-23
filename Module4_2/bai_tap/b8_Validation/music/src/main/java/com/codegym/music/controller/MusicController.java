package com.codegym.music.controller;

import com.codegym.music.model.Music;
import com.codegym.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class MusicController {
    @Autowired
    private MusicService musicService;

    @GetMapping("")
    public ModelAndView showList(@PageableDefault(size = 5) Pageable pageable){
        return new ModelAndView("index", "music", musicService.findAll(pageable));
    }

    @GetMapping("create")
    public String showCreateForm(Model model){
        model.addAttribute("music", new Music());
        return "create";
    }

    @PostMapping("save")
    public String save(@Valid Music music, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if (bindingResult.hasFieldErrors()){
            return "create";
        } else {
            musicService.save(music);
            redirectAttributes.addAttribute("succces", "Create success");
            return "redirect:/";
        }
    }
}
