package practic.lesson2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Main", urlPatterns = "/main/*")
public class Main extends HttpServlet {
    private Logger logger = LoggerFactory.getLogger(Main.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.getWriter().println("<html>\n" +
                "<head>\n" +
                "</head>\n" +
                "<style>\n" +
                "ul.menu {\n" +
                "margin: 0;\n" +
                "padding: 4px;\n" +
                "}\n" +
                "ul.menu li {\n" +
                "display: inline-block;\n" +
                "margin-right: 5px;\n" +
                "padding: 3px;\n" +
                "text-align: center;\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "<ul class=\"menu\">\n" +
                "  <li><a href=\"" + req.getContextPath() + "/main" + "\">Home</a></li>\n" +
                "  <li><a href=\"" + req.getContextPath() + "/catalog" + "\">Catalog</a></li>\n" +
                "  <li><a href=\"" + req.getContextPath() + "/product" +  "\">Product</a></li>\n" +
                "  <li><a href=\""+ req.getContextPath() + "/cart" + "\">Cart</a></li>\n" +
                "  <li><a href=\""+ req.getContextPath() + "/order" + "\">Order</a></li>\n" +
                "</ul>\n" +
                "</body>\n"+
                "</html>"
);
        logger.info("New request url /main");

    }
}
