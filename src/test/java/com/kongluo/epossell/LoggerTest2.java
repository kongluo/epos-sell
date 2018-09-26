package com.kongluo.epossell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: epos-sell
 * @description:
 * @author: Mr.Wang
 * @create: 2018-09-18 14:04
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest2
{
    private final Logger logger = LoggerFactory.getLogger(LoggerTest2.class);

    @Test
    public void test1(){
        logger.debug("debug...");
        logger.info("info...");
        logger.error("error...");
    }
}
