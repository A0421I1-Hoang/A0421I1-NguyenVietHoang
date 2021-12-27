package com.codegym.controller;

import com.codegym.model.Music;
import com.codegym.model.MusicForm;
import com.codegym.service.IMusicService;
import com.codegym.service.MusicService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Value("${music-upload}")
    private String fileUpload;
    private final IMusicService musicService = new MusicService();

    @GetMapping("")
    public String index(Model model) {
        List<Music> music = musicService.findAll();
        model.addAttribute("music", music);
        return "/index";
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("musicform", new MusicForm());
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView saveProduct(@ModelAttribute MusicForm musicForm) {
        String multipartFile = musicForm.getLink();
        byte[] fileName = multipartFile.getBytes();
        try {
            FileCopyUtils.copy(musicForm.getLink().getBytes(), new File(fileUpload + fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Music music = new Music(musicForm.getName(), musicForm.getSinger(),
                musicForm.getCategory(), fileName);
        musicService.save(music);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("musicForm", musicForm);
        modelAndView.addObject("message", "Created new music successfully !");
        return modelAndView;
    }
}
