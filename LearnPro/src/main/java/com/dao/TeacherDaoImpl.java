package com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.TeacherInfo;
import com.util.HibernateUtil;

public class TeacherDaoImpl  implements TeacherDao
{

	@Override
	public int insertTeacher(TeacherInfo t) 
	{
		Session session = null;;
		Transaction tx = null;
		int id=0;
		try {
			System.out.println("In DaoImp");
			session=HibernateUtil.getSession();
			tx = session.beginTransaction();
		    id=(Integer) session.save(t);
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
		return 0;
	}

}
