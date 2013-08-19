package com.tvelykyy.indexator.dao;

import com.tvelykyy.indexator.model.Page;

public interface PageDao {
    int saveUnindexedPage(Page page);
}
