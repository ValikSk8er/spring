package com.valiksk8.configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebConfiguration implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        // сервлет контекст
        // інтерфейс, розширює BeanFactory
        AnnotationConfigWebApplicationContext root =
                new AnnotationConfigWebApplicationContext();

        root.scan("com.valiksk8");
        //
        sc.addListener(new ContextLoaderListener(root));

        ServletRegistration.Dynamic appServlet = sc.addServlet(
                "dispatcher",
                new DispatcherServlet(new GenericWebApplicationContext()));
        // шоб сервлет запустився одразу
        appServlet.setLoadOnStartup(1);
        appServlet.addMapping("/");
    }
}
