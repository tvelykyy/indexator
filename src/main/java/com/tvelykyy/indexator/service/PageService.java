package com.tvelykyy.indexator.service;

import com.tvelykyy.indexator.model.UnindexedPage;

public interface PageService {
    void createNotIndexedPage(UnindexedPage unindexedPage);
}
