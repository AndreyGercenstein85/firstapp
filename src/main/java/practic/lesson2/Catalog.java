package practic.lesson2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.FirstHttpServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "catalog", urlPatterns = "/catalog/*")

public class Catalog extends HttpServlet {
    private Logger logger = LoggerFactory.getLogger(Catalog.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Catalog</h1>");
        getServletContext().getRequestDispatcher("/main").include(req,resp);
        logger.info("New request url /catalog");
    }
}
