package com.tvelykyy.indexator;

import com.tvelykyy.indexator.dao.PageDao;
import com.tvelykyy.indexator.model.Page;
import com.tvelykyy.indexator.model.UnindexedPage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TempMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PageDao pageDao = context.getBean(PageDao.class);

        UnindexedPage page = new UnindexedPage();
        page.setTitle("Title");
        page.setUrl("http://google.com" + Math.random());
        page.setUnindexedInDays(15);

        int id = pageDao.insertPage(page);
        pageDao.insertUnindexedPage(page);

        System.out.println(page.getId() + " " + id);
    }
}
