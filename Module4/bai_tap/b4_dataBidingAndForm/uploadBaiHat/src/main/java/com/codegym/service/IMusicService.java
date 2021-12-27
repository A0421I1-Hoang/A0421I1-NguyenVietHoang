package com.codegym.service;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void save(Music music);

    Music findById(int id);

    void update(String name, Music music);

    void remove(String name);
}
