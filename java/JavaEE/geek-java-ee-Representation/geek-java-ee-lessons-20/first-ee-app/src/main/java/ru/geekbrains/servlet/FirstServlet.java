package ru.geekbrains.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;
import java.io.Serializable;

public class FirstServlet implements Servlet, Serializable {

    private static final Logger logger = LoggerFactory.getLogger(FirstServlet.class);

    private transient ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        logger.info("Servlet created");
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        logger.info("New request");

        req.setAttribute("headerText", "FirstHttpServlet");
        config.getServletContext().getRequestDispatcher("/header").include(req, resp);
    }

    @Override
    public String getServletInfo() {
        return "Our first servlet";
    }

    @Override
    public void destroy() {
        logger.info("Servlet destroyed");
    }
}
