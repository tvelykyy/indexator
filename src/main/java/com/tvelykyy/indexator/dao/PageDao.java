package com.tvelykyy.indexator.dao;

import com.tvelykyy.indexator.model.Page;
import com.tvelykyy.indexator.model.UnindexedPage;

public interface PageDao {

    int insertPage(Page page);

    int insertUnindexedPage(UnindexedPage unindexedPage);

}
