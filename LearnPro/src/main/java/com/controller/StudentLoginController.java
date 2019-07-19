package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.model.StudentInfo;


public class StudentLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		StudentInfo studLogin = new StudentInfo();
		String asl=request.getParameter("login");
		out.print(asl);
	    String userName = request.getParameter("Email");
	    String password = request.getParameter("Password");
	    
	    if(asl.equals("student"))
	    {
	    	StudentDao sd=new StudentDaoImpl();
	    	if(sd.loginStudent(userName, password)==true)
	    	{
	    		RequestDispatcher rd=request.getRequestDispatcher("StudentRegistration.jsp");
	    		rd.forward(request, response);
	    	}
	    	else
	    	{
	    		RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
	    		rd.forward(request, response);
	    	}
	    }
	    else if(asl.equals("teacher"))
	    {
	    	StudentDao sd=new StudentDaoImpl();
		    if(sd.loginStudent(userName, password)==true)
		    {
		    	RequestDispatcher rd=request.getRequestDispatcher("TeacherRegistration.jsp");
		    	rd.forward(request, response);
		    }
		    else
		    {
		    	RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		    	rd.forward(request, response);
		    }
	    }
	    
	}

	

}
