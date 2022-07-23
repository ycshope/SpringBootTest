package org.example.boot.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@Slf4j
@WebListener
public class ListenerDemo1 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("ListenerDemo1:Project Initialized...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("ListenerDemo1:Project Destroyed...");
    }
}
