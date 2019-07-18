package com.controller;

import java.io.IOException;

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

		StudentInfo studLogin = new StudentInfo();
	    String userName = request.getParameter("Email");
	    String password = request.getParameter("Password");
	    
	    StudentDao sd=new StudentDaoImpl();
	    if(sd.loginStudent(userName, password)==true)
	    {
	    	RequestDispatcher rd=request.getRequestDispatcher("StudentRegistration.jsp");
	    	rd.forward(request, response);
	    }
	    else
	    {
	    	RequestDispatcher rd=request.getRequestDispatcher("StudentLogin.jsp");
	    	rd.forward(request, response);
	    }
	}

	

}
