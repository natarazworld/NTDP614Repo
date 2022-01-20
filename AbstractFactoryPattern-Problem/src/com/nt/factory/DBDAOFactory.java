package com.nt.factory;

import com.nt.dao.DAO;
import com.nt.dao.DBCourseDAO;
import com.nt.dao.DBStudentDAO;

public class DBDAOFactory {
	
	public static  DAO  createDAO(String type) {
		   DAO dao=null;
		   if(type.equalsIgnoreCase("student"))
			     dao=new DBStudentDAO();
		   else if(type.equalsIgnoreCase("course"))
			     dao=new DBCourseDAO();
		   else
			   throw new IllegalArgumentException("Invalid DAO type");
		   return dao;
	}

}
