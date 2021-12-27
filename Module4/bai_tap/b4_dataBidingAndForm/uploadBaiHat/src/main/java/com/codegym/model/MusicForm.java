package com.codegym.model;


public class MusicForm {
    private String name;
    private String singer;
    private String category;
    private String link;

    public MusicForm() {
    }

    public MusicForm(String name, String singer, String category, String link) {
        this.name = name;
        this.singer = singer;
        this.category = category;
        this.link = link;
    }

    public MusicForm(String name, String category, byte[] fileName) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
