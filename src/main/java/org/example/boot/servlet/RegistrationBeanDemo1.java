package org.example.boot.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class RegistrationBeanDemo1 {
    @Bean
    public ServletRegistrationBean testServlet() {
        ServletDemo2 servletDemo2 = new ServletDemo2();
        return new ServletRegistrationBean(servletDemo2, "/servletdemo2"); // /servletdemo2注册为servlet
    }

    @Bean
    public FilterRegistrationBean testFilter() {
        FilterDemo2 filterDemo2 = new FilterDemo2();
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(filterDemo2);    //filterDemo2注册为filter
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/filterdemo2"));   // 拦截路径
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean testListener() {
        ListenerDemo2 listenerDemo2 = new ListenerDemo2();
        return new ServletListenerRegistrationBean(listenerDemo2);  //listenerDemo2注册为ServletListener
    }
}
