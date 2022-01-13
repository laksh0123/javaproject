package Controller;

import java.io.IOException;
 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
 
@WebServlet("/logout")
public class Logout extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public Logout() {
        super();
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.removeAttribute("Login");
             
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
            Cookie ck = new Cookie("username", "");
            ck.setMaxAge(60*60);
            response.addCookie(ck);
            Cookie ck1 = new Cookie("password", "");
            ck1.setMaxAge(60*60);
            response.addCookie(ck1);
        }
    }
}