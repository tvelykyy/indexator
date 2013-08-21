package com.tvelykyy.indexator.model;

public class Page {

    protected Integer id;
    protected String url;
    protected String title;

    public Page() {
    }

    public Page(Integer id) {
        this.id = id;
    }

    public Page(Integer id, String url, String title) {
        this.id = id;
        this.url = url;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
