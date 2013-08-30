package com.tvelykyy.indexator.model;

import org.joda.time.LocalDate;

public class IndexState {

    private boolean indexed;
    private LocalDate date;

    public static IndexState getFalseIndexStateForDate(LocalDate date) {
        return new IndexState(false, date);
    }

    public static IndexState getTrueIndexStateForDate(LocalDate date) {
        return new IndexState(true, date);
    }

    private IndexState(boolean indexed, LocalDate date) {
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
