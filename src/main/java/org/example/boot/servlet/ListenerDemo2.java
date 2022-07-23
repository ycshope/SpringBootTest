package org.example.boot.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Slf4j
public class ListenerDemo2 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("ListenerDemo2:Project Initialized...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("ListenerDemo2:Project Destroyed...");
    }
}
