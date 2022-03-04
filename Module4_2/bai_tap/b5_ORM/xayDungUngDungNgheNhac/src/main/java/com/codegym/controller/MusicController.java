package com.codegym.controller;

import com.codegym.model.Music;
import com.codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("musics")
public class MusicController {
    @Autowired
    private IMusicService musicService;

    @GetMapping("/")
    public String showList(Model model){
        model.addAttribute("music", musicService.fillAll());
        return "index";
    }

    @GetMapping("/create")
    public String showCreteForm(Model model){
        model.addAttribute("music", new Music());
        return "create";
    }

    @PostMapping("/save")
    public String save(Music music){
        musicService.save(music);
        return "redirect:/musics/";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model){
        model.addAttribute("music", musicService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(Music music){
        musicService.save(music);
        return "redirect:/musics/";
    }

    @GetMapping("/{id}/delete")
    public String showDeleteForm(@PathVariable Long id, Model model){
        model.addAttribute("music", musicService.findById(id));
        return "delete";
    }

    @PostMapping("/remove")
    public String remove(Long id){
        musicService.delete(id);
        return "redirect:/musics/";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable Long id, Model model){
        model.addAttribute("music", musicService.findById(id));
        return "view";
    }
}
