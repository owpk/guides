package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie")
public class SetCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("url","myDomain");
        //обязательное поле - время жизни куки
        cookie.setMaxAge(60*60*60);

        //чтобы удалить куки
        //cookie.setMaxAge(0);

        //чтобы куки удалились после закрытия браузера
        //cookie.setMaxAge(-1);

        resp.addCookie(cookie);

        RequestDispatcher rd = req.getRequestDispatcher("/cookie.jsp");
        rd.forward(req, resp);
    }
}
