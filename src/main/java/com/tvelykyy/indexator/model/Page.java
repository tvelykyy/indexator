package com.tvelykyy.indexator.model;

public class Page {

    protected int id;
    protected String url;
    protected String title;

    public Page() {
    }

    public Page(int id) {
        this.id = id;
    }

    public Page(int id, String url, String title) {
        this.id = id;
        this.url = url;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
