package Controller;

//taking request and sending to server
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.RegiDAO;

import Model.RegiM;


@WebServlet("/Register1")
public class Regis extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private RegiDAO regiDAO;

    public void init() {
    	regiDAO = new RegiDAO();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	response.getWriter().append("Served at:").append(request.getContextPath());
    	RequestDispatcher dispacher = request.getRequestDispatcher("regi.jsp"); //getting
    	dispacher.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String Fname = request.getParameter("fname");
        String Lname = request.getParameter("lname");
        String Phone = request.getParameter("phone");
        String Username = request.getParameter("Username");
        String Password = request.getParameter("password");
       
        RegiM Register = new RegiM();
        
        Register.setFname(Fname);
        Register.setLname(Lname);
        Register.setPhone(Phone);
        Register.setUsername(Username);
        Register.setPassword(Password);
        
        
         
        try {
        	regiDAO.registeruser(Register);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        RequestDispatcher dispacher = request.getRequestDispatcher("home1.jsp"); //forward
    	dispacher.forward(request, response);
    }
}