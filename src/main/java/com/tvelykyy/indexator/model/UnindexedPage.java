package com.tvelykyy.indexator.model;

public class UnindexedPage extends Page {

    protected int unindexedInDays;

    public UnindexedPage() {
    }

    public UnindexedPage(int id) {
        super(id);
    }

    public UnindexedPage(int id, String url, String title, int unindexedInDays) {
        super(id, url, title);
        this.unindexedInDays = unindexedInDays;
    }

    public int getUnindexedInDays() {
        return unindexedInDays;
    }

    public void setUnindexedInDays(int unindexedInDays) {
        this.unindexedInDays = unindexedInDays;
    }

}
