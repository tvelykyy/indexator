package com.tvelykyy.indexator.dao;

import com.tvelykyy.indexator.model.IndexState;
import com.tvelykyy.indexator.model.Page;

public interface PageDao {

    int createPage(Page page);

    void addIndexState(Page page, IndexState state);

}
