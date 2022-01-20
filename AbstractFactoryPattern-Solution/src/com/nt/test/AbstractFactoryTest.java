package com.nt.test;

import com.nt.dao.DAO;
import com.nt.factory.DAOFactory;
import com.nt.factory.DAOFactoryCreator;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		//get Factory throuhg Abstract Factory(super factory)
		DAOFactory  factory=DAOFactoryCreator.buildDAOFactory("DB");
		// create DAO classes objects using  factory
		DAO studDAO=factory.createDAO("Student");
		DAO  courseDAO=factory.createDAO("course");
		studDAO.insert();
		System.out.println("..........");
		courseDAO.insert();
	}//main
}//class
