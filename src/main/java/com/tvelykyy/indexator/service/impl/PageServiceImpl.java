package com.tvelykyy.indexator.service.impl;

import com.tvelykyy.indexator.dao.PageDao;
import com.tvelykyy.indexator.model.UnindexedPage;
import com.tvelykyy.indexator.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PageServiceImpl implements PageService {

    @Autowired
    PageDao pageDao;

    @Override
    @Transactional
    public void createNotIndexedPage(UnindexedPage unindexedPage) {
        UnindexedPage page = new UnindexedPage();
        page.setTitle("Title");
        page.setUrl("http://google.com" + Math.random());
        page.setUnindexedInDays(15);

        pageDao.insertPage(page);
        pageDao.insertUnindexedPage(page);
    }
}
