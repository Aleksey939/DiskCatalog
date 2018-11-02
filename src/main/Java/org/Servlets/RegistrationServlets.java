package org.Servlets;
import org.dao.UserDao;
import org.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/registration")
public class RegistrationServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        User newUser = new User(login, email, password);
        HttpSession session = req.getSession();
        session.setAttribute("user", email);
        UserDao userdao=new UserDao();
        userdao.save(newUser);
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }
}
