package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TeacherDao;
import com.dao.TeacherDaoImpl;
import com.model.TeacherInfo;

public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String fullname=request.getParameter("FullName");
		String email=request.getParameter("Email");
		String phoneno=request.getParameter("PhoneNo");
		String address=request.getParameter("Address");
		String gender=request.getParameter("Gender");
		String qualification=request.getParameter("Qualification");
		String password=request.getParameter("Password");
		String photo=request.getParameter("Photo");
		
		String experience=request.getParameter("Experience");
		String fees=request.getParameter("Fees");
		
		int homeTeacher=Integer.parseInt(request.getParameter("HomeTeacher"));
		int homeStudent=Integer.parseInt(request.getParameter("HomeStudent"));
		int online=Integer.parseInt(request.getParameter("Online"));
		
		TeacherInfo t=new TeacherInfo(fullname,email,phoneno,address,gender,qualification,password,photo,experience,fees,homeTeacher,homeStudent,online);
		TeacherDao tchdao=new TeacherDaoImpl(); 
		if(tchdao.insertTeacher(t)!=0)
			response.sendRedirect("StudentRegistration.jsp");
		else
			out.println("inserted");
	}

	
}


