package owpk.servlet;

import owpk.jms.PutGet;
import owpk.service.SingletonEJB;
import owpk.service.SingletonInject;

//import javax.ejb.EJB;
//import javax.inject.Inject;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(urlPatterns = "/hello")
public class Servlet extends HttpServlet {

//    @EJB
//    private SingletonEJB ejb;
//    @Inject
//    private SingletonInject inject;
//    @Inject
//    private PutGet putGet;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Hello");
//        putGet.sendMsg();
    }
}