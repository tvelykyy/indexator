package com.tvelykyy.indexator.model;

import java.util.ArrayList;
import java.util.List;

public class Page {

    private Integer id;
    private String url;
    private String title;

    private List<IndexState> indexLog = new ArrayList <IndexState>();

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

    public List<IndexState> getIndexLog() {
        return indexLog;
    }

    public void setIndexLog(List<IndexState> indexLog) {
        this.indexLog = indexLog;
    }

    public void addIndexState(IndexState state) {
        this.indexLog.add(state);
    }

    public IndexState getLastIndexState() {
        int lastElementIndex = this.indexLog.size() - 1;
        return this.indexLog.get(lastElementIndex);
    }

}
