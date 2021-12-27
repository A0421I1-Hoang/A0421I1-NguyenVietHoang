package com.codegym.service;

import com.codegym.model.Music;

import java.util.ArrayList;
import java.util.List;

public class MusicService implements IMusicService {
    private List<Music> music = new ArrayList<>();

    @Override
    public List<Music> findAll() {
        return music;
    }

    @Override
    public void save(Music musics) {
        music.add(musics);
    }

    @Override
    public Music findById(int id) {
        return music.get(id);
    }

    @Override
    public void update(String name, Music musics) {
        for (Music m : music) {
            if (m.getName() == name) {
                m = musics;
                break;
            }
        }
    }

    @Override
    public void remove(String name) {
        for (int i = 0; i < music.size(); i++) {
            if (music.get(i).getName() == name) {
                music.remove(i);
                break;
            }
        }
    }
}
