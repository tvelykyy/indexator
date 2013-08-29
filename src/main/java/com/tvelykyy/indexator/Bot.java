package com.tvelykyy.indexator;

import com.tvelykyy.indexator.service.PageService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bot {

    @Autowired
    PageService pageService;

    private static WebDriver driver = new FirefoxDriver();

    public void getNotIndexedPagesFromGgl() {
        driver.get("http://gogetlinks.net/");
    }
}
