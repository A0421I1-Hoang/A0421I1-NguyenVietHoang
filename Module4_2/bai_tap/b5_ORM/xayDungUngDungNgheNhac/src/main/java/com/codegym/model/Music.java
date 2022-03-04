package com.codegym.model;

import javax.persistence.*;

@Entity(name = "music")
public class Music {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "singer")
    private String singer;

    @Column(name = "type")
    private String type;

    @Column(name = "link")
    private String link;

    public Music() {}

    public Music(Long id, String name, String singer, String type, String link) {
        this.id = id;
        this.name=name;
        this.singer = singer;
        this.type = type;
        this.link = link;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
