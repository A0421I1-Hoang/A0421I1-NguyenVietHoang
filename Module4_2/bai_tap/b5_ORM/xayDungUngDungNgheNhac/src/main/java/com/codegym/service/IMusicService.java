package com.codegym.service;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> fillAll();

    void save(Music music);

    Music findById(Long id);

    void update(Music music);

    void delete(Long id);
}
