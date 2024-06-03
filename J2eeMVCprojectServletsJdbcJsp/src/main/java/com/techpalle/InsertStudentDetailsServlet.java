package com.techpalle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.DataAccess;


@WebServlet("/insertstudent")
public class InsertStudentDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public InsertStudentDetailsServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name = request.getParameter("name");
		String course = request.getParameter("course");
		String Gender = request.getParameter("rdgender");
		String email = request.getParameter("email");
		String qualification = request.getParameter("qualification");
		
		//PrintWriter out = response.getWriter();
		//out.println("name is.." + name);
		//out.println("course is.." + course);
		
		DataAccess.insertStudent(name, course, Gender, email, qualification);
	}
}
