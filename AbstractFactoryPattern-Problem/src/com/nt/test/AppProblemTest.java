package com.nt.test;

import com.nt.dao.DAO;
import com.nt.factory.DBDAOFactory;
import com.nt.factory.ExcelDAOFactory;

public class AppProblemTest {

	public static void main(String[] args) {
		DAO studDAO=DBDAOFactory.createDAO("student");
		DAO  courseDAO=ExcelDAOFactory.createDAO("course");
		studDAO.insert();
		System.out.println("..........");
		courseDAO.insert();
	}//main
}//class
