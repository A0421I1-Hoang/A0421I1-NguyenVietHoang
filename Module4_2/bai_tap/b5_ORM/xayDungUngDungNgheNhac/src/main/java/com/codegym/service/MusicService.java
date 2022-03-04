package com.codegym.service;

import com.codegym.model.Music;
import com.codegym.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicService implements IMusicService{

    @Autowired
    private MusicRepository musicRepository;

    @Override
    public List<Music> fillAll() {
        return musicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public Music findById(Long id) {
        return musicRepository.findById(id);
    }

    @Override
    public void update(Music music) {
        musicRepository.save(music);
    }

    @Override
    public void delete(Long id) {
        musicRepository.remove(id);
    }
}
