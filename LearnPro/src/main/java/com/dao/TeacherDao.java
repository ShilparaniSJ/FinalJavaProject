package com.dao;


import com.model.TeacherInfo;

public interface TeacherDao 
{
	 int insertTeacher(TeacherInfo t);
	 public boolean loginTeacher(String username,String password);

}
