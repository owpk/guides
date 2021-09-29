package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.persist.ToDo;
import ru.geekbrains.persist.ToDoRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import static ru.geekbrains.listener.AppBootstrapListener.TODO_REPO;

@WebServlet(name = "ToDoServlet", urlPatterns = {"", "/"})
public class ToDoServlet extends HttpServlet {

    private static final Logger logger = LoggerFactory.getLogger(ToDoServlet.class);

    private ToDoRepository repository;

    @Override
    public void init() throws ServletException {
        repository = (ToDoRepository) getServletContext().getAttribute(TODO_REPO);
        if (repository == null) {
            throw new ServletException("ToDo repository not initialized");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Index toDo page");

        if (req.getServletPath().equals("/")) {
            try {
                req.setAttribute("todos", repository.findAll());
                getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
            } catch (SQLException ex) {
                throw new IllegalStateException(ex);
            }
        } else if (req.getServletPath().equals("/new")) {
            req.setAttribute("toDo", new ToDo());
            getServletContext().getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(req, resp);
        } else if (req.getServletPath().equals("/edit")) {
            getServletContext().getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(req, resp);
        } else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            repository.insert(new ToDo(-1L,
                    req.getParameter("description"),
                    LocalDate.parse(req.getParameter("targetDate"))));
            resp.sendRedirect(getServletContext().getContextPath());
        } catch (SQLException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
