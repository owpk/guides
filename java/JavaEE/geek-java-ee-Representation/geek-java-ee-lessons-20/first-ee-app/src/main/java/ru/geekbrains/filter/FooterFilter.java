package ru.geekbrains.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalDateTime;

@WebFilter(urlPatterns = "/*")
public class FooterFilter implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpReq = (HttpServletRequest) request;
        String user = httpReq.getParameter("user");
        if (user != null) {
            chain.doFilter(request, response);
            response.getWriter().println("<footer>" + LocalDateTime.now() + "</footer>");
        }
        filterConfig.getServletContext().getRequestDispatcher("");
    }

    @Override
    public void destroy() {

    }
}
