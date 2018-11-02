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

@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String email = req.getParameter("email");
        String password = req.getParameter("password");


        User newuser = new User(login, email, password);

        //if

        HttpSession session = req.getSession();
        session.setAttribute("user", newuser);



        if(session.getAttribute("requestPage") != null) {
            resp.sendRedirect(session.getAttribute("requestPage").toString());
        } else {
            resp.sendRedirect("/WEB-INF/index.jsp");
        }
        //req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }
}
