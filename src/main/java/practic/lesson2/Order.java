package practic.lesson2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Order", urlPatterns = "/order/*")
public class Order extends HttpServlet {
    private Logger looger = LoggerFactory.getLogger(Cart.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Order</h1>");
        getServletContext().getRequestDispatcher("/main").include(req,resp);
        looger.info("New request url /order");
    }
}
