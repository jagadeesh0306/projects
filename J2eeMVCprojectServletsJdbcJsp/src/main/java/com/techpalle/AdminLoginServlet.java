package com.techpalle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.DataAccess;

@WebServlet("/login")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminLoginServlet()
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// Reading the data
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		//Displaying the data
		PrintWriter out = response.getWriter();
		out.println("email : " + email);
		out.println("pw : " + pw);
		// Verification is over
		
		//JDBC code to verify whether admin credentials are correct or not
		boolean result = DataAccess.checkAdminLogin(email, pw);
		
		if(result == true)
		{
			response.sendRedirect("welcome.jsp");
			//out.println("LOGIN SUCESS");
		}
		else
		{
			out.println("LOGIN FAILURE");
		}	
	}
}
