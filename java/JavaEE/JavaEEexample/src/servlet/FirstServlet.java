package servlet;

import model.Workable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/hello")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Session
        HttpSession httpSession = req.getSession();
        System.out.println(httpSession.getId());
        Workable worker = (Workable) httpSession.getAttribute("worker");

        String name = req.getParameter("name");
        String pass = req.getParameter("pass");
        String id = httpSession.getId();
        if(worker == null) {
            worker = new Workable(name,pass,id);
            httpSession.setAttribute("worker", worker);
        }

        System.out.println();


//        Writer w = resp.getWriter();

        //redirect
        //resp.sendRedirect("https://www.google.com");
        //resp.sendRedirect("/index.jsp");

        //forward
        RequestDispatcher rd = req.getRequestDispatcher("/example.jsp");
        rd.forward(req, resp);

//        w.close();
    }
}
