package com.tvelykyy.indexator.service.impl;

import com.tvelykyy.indexator.dao.PageDao;
import com.tvelykyy.indexator.model.IndexState;
import com.tvelykyy.indexator.model.Page;
import com.tvelykyy.indexator.service.PageService;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PageServiceImpl implements PageService {

    @Autowired
    PageDao pageDao;

    @Override
    @Transactional
    public void createNotIndexedPage(Page page) {
        Page testPage = new Page();
        testPage.setTitle("Bla-Bla");
        testPage.setUrl("http://tvelykyy.com" + Math.random());
        pageDao.createPage(testPage);
        pageDao.addIndexState(testPage, new IndexState(false, new LocalDate()));

    }
}
