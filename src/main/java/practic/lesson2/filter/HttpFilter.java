package practic.lesson2.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter(filterName = "HeadFooter", urlPatterns = "/*")

public class HttpFilter implements Filter {
    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest Request, ServletResponse Response, FilterChain Chain) throws IOException, ServletException {

        Chain.doFilter(Request, Response);
        Response.setCharacterEncoding("text/html; charset=utf8");
    }
}
