package com.nt.dao;

public class ExcelStudentDAO implements DAO {

	@Override
	public void insert() {
		System.out.println("ExcelStudentDAO.insert() :: inserting student details to  Excel");
	}

}
