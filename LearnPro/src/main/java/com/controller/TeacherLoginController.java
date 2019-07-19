package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TeacherDao;
import com.dao.TeacherDaoImpl;
import com.model.TeacherInfo;

public class TeacherLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TeacherInfo tchLogin = new TeacherInfo();
	    String userName = request.getParameter("Email");
	    String password = request.getParameter("Password");
	    
	    TeacherDao sd=new TeacherDaoImpl();
	    if(sd.loginTeacher(userName, password)==true)
	    {
	    	RequestDispatcher rd=request.getRequestDispatcher("TeacherRegistration.jsp");
	    	rd.forward(request, response);
	    }
	    else
	    {
	    	RequestDispatcher rd=request.getRequestDispatcher("TeacherLogin.jsp");
	    	rd.forward(request, response);
	    }
		}

}
