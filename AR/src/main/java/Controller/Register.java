package Controller;

//taking request and sending to server
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.RegisterDAO;
import Model.RegisterM;

@WebServlet("/Register")
public class Register extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public Register() {
    	super();
    }
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        RegisterDAO userDao = new RegisterDAO();
    
    try {
        RegisterM user = userDao.checkLogin(username, password);
        String destPage = "index.jsp";
        
        Cookie ck = new Cookie("username", username);
        response.addCookie(ck);
        Cookie ck1 = new Cookie("password",password );
        response.addCookie(ck1);
         
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            destPage = "home3.jsp";
        } else {
            String message = "Invalid email/password";
            request.setAttribute("message", message);
        }
         
        RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
        dispatcher.forward(request, response);
         
    } catch (SQLException | ClassNotFoundException ex) {
        throw new ServletException(ex);
    }
}
}