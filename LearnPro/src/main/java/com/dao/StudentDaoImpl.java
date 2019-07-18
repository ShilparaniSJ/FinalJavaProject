package com.dao;

import java.util.Iterator;

import org.hibernate.Hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.StudentInfo;
import com.util.*;



public class StudentDaoImpl implements StudentDao
{

	public int insertStudent(StudentInfo s) 
	{
		Session session = null;;
		Transaction tx = null;
		int id=0;
		try {
			System.out.println("In DaoImp");
			session=HibernateUtil.getSession();
			tx = session.beginTransaction();
		    id=(Integer) session.save(s);
			System.out.println("Record Id "+id);
			System.out.println("After connection");
			tx.commit();
		} 
		catch (HibernateException h) 
		{
			tx.rollback();
			System.out.println(h);
		} 
		finally 
		{
			if(session!=null)
			session.close();
			//HibernateUtil.closeSessionFactory();
		}
		return id;

	}

	
	
	@Override
	public boolean loginStudent(String username, String password) 
	{
		Session session1 = null;;
		Transaction tx = null;
		
	    session1=HibernateUtil.getSession();
		if(session1!=null) 
		{
			System.out.println("User"+username+"pass"+password);
			try
			{
				Query q=session1.createQuery("select count(*) from StudentInfo");
				Iterator count=q.iterate();
				
				String size=count.next().toString();
				int s=Integer.parseInt(size);
				System.out.println("No of rows:"+size);
				for(int i=1;i<=s;i++)
				{
					StudentInfo st=(StudentInfo)session1.get(StudentInfo.class,i);
					if(password.equals(st.getPassword()) && username.equals(st.getEmail()))
					{
						System.out.println("Login Successfully");
						return true;
					}
				}
			}
			catch (HibernateException h) 
			{
				tx.rollback();
				System.out.println(h);
			} 
			finally 
			{
				if(session1!=null)
				session1.close();
				//HibernateUtil.closeSessionFactory();
			}
		}
		return false;
	}

	 
}
