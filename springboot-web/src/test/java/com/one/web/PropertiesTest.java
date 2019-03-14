package com.one.web;

import com.one.web.config.NeoProperties;
import com.one.web.config.OtherProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author One
 * @description 配置文件测试
 * @date 2019/03/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    @Value("${neo.title}")
    private String title;

    @Test
    public void testTitle() {
        Assert.assertEquals(title, "abc");
    }

    @Resource
    private NeoProperties properties;

    @Test
    public void testMore() throws Exception {
        System.out.println("title:" + properties.getTitle());
        System.out.println("description:" + properties.getDescription());
    }

    @Resource
    OtherProperties otherProperties;

    @Test
    public void testOther() throws Exception {
        System.out.println("title:" + otherProperties.getTitle());
        System.out.println("blog:" + otherProperties.getBlog());
    }
}
