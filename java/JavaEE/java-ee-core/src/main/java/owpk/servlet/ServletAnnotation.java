package owpk.servlet;

import owpk.jms.PutGet;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(urlPatterns = "/jms")
public class ServletAnnotation extends HttpServlet {

    @Inject
    private PutGet putGet;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        putGet.sendMsg();
        resp.getWriter().println("message sent");
    }
}
