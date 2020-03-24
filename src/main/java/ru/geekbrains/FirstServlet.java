package ru.geekbrains;

import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Logger;

public class FirstServlet implements Servlet, Serializable {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(FirstServlet.class);

    private transient ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = config;

    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        logger.info("New request");

        res.getWriter().println("<h1>Hello world from Servlet</h1>");
        res.getWriter().println("<p>attr1:" + req.getAttribute("attr1") + "</p>");

    }

    @Override
    public String getServletInfo() {
        return "Hello world Servlet";
    }

    @Override
    public void destroy() {
        logger.info("Firstservlet class destroy");
    }
}
