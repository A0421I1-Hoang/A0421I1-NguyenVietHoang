package com.codegym.model;

public class Mail {
    private int id;
    private String languages;
    private int pageSize;
    private boolean spamsFiller;
    private String signature;
    private String content;

    public Mail() {
    }

    public Mail(int id, String languages, int pageSize, boolean spamsFiller, String signature, String content) {
        this.id=id;
        this.languages = languages;
        this.pageSize = pageSize;
        this.spamsFiller = spamsFiller;
        this.signature = signature;
        this.content=content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamsFiller() {
        return spamsFiller;
    }

    public void setSpamsFiller(boolean spamsFiller) {
        this.spamsFiller = spamsFiller;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
