package com.tvelykyy.indexator;

import com.tvelykyy.indexator.service.PageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TempMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PageService pageService = context.getBean(PageService.class);

        pageService.createNotIndexedPage(null);
    }
}
