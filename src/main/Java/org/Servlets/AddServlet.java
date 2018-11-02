package org.Servlets;

import org.dao.DiskDao;
import org.entity.Disk;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/addcd.jsp").forward(req, resp);


    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();
        ServletContext context = config.getServletContext();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        DiskDao diskDao = new DiskDao();

        String title = req.getParameter("title");
        String  album= req.getParameter("album");
        Disk newdisk=new Disk(title,album);
        diskDao.save(newdisk);


        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
       // resp.sendRedirect("/WEB-INF/index.jsp");

    }
}
