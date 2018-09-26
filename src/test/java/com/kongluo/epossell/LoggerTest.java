package com.kongluo.epossell;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class LoggerTest
{
    @Test
    public void test1(){
        String name = "kongluo";
        String password = "123456";
        log.debug("debug...");
        log.info("info...");
        log.info("info: {},password: {}",name,password);
        log.error("error...");
        log.warn("warn...");
    }
}
