package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nt.bo.FinanceEmployeeBO;

public class FinanceEmployeeDAOImpl implements IFinanceEmployeeDAO {
	private  static final String INSERT_FINANCE_EMPLOYEE="INSERT INTO BD_FINANCE_EMPLOYEE VALUES(BD_EMPNO_SEQ.CURRVAL,?,?,?,?)";

	@Override
	public boolean insertEmployee(Connection con,FinanceEmployeeBO financeBO) throws SQLException,Exception {
		PreparedStatement ps=null;
		try {
			//create JDBC PreparedStatement object
			ps=con.prepareStatement(INSERT_FINANCE_EMPLOYEE);
			//set values to query params
			ps.setString(1, financeBO.getEmpName());
			ps.setString(2, financeBO.getEmpAddrs());
			ps.setString(3, financeBO.getEmpDesg());
			ps.setDouble(4,financeBO.getSalary());
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
