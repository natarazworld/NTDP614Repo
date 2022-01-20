package com.nt.dao;

public class DBCourseDAO implements DAO {

	@Override
	public void insert() {
		System.out.println("DBCourseDAO.insert() :: inserting course details to  DB");
	}

}
