package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.model.StudentInfo;

public class StudentController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String firstname=request.getParameter("FullName");
		String email=request.getParameter("Email");
		String phoneno=request.getParameter("PhoneNo");
		String address=request.getParameter("Address");
		String gender=request.getParameter("Gender");
		String qualification=request.getParameter("Qualification");
		String password=request.getParameter("Password");
		
		StudentInfo s=new StudentInfo(firstname,email,phoneno,address,gender,qualification,password);
		StudentDao stddao=new StudentDaoImpl(); 
		if(stddao.insertStudent(s)!=0)
			response.sendRedirect("StudentRegistration.jsp");
		else
			out.println("inserted");
	}

}
