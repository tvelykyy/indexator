package com.tvelykyy.indexator.model;

import org.joda.time.LocalDate;

public class IndexState {

    private boolean indexed;
    private LocalDate date;

    public IndexState(boolean indexed, LocalDate date) {
        this.indexed = indexed;
        this.date = date;
    }

    public boolean isIndexed() {
        return indexed;
    }

    public void setIndexed(boolean indexed) {
        this.indexed = indexed;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
