package com.tvelykyy.indexator.dao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@ContextConfiguration(locations = {"/test-spring-dao-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class PageDaoImplTest {

    @Test
    public void shouldPass() {
        assertTrue(true);
    }
}
