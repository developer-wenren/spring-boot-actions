package com.one.web.config;

import com.one.web.filter.MyFilter;
import com.one.web.filter.MyFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @author One
 * @description
 * @date 2019/03/14
 */
@Configuration
public class WebConfiguration {
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new MyFilter());
        bean.addUrlPatterns("/*");
        bean.setName("MyFilter");
        bean.setOrder(6);
        return bean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean2() {
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new MyFilter2());
        bean.addUrlPatterns("/*");
        bean.setName("MyFilter2");
        bean.setOrder(4);
        return bean;
    }
}
