package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.nt.bo.HREmployeeBO;
import com.nt.factory.ConnectionFactory;

public class HREmployeeDAOImpl implements IHREmployeeDAO {
	private  static final String INSERT_HR_EMPLOYEE="INSERT INTO BD_HR_EMPLOYEE VALUES(BD_EMPNO_SEQ.NEXTVAL,?,?,?)";

	@Override
	public boolean insertEmployee(Connection con,HREmployeeBO hrBO) throws SQLException,Exception {
		PreparedStatement ps=null;
		try {
			//create JDBC PreparedStatement object
			ps=con.prepareStatement(INSERT_HR_EMPLOYEE);
			//set values to query params
			ps.setString(1, hrBO.getEmpName());
			ps.setString(2, hrBO.getEmpAddrs());
			ps.setString(3, hrBO.getEmpDesg());
			//execute the query
			int count=ps.executeUpdate();
			if(count==0)
				return false;
			else
				return true;
		}//try
		catch(SQLException se) {
			se.printStackTrace();
            throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}//method

}//class
