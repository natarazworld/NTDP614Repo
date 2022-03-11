package com.nt.delegate;

import java.sql.Connection;
import java.sql.SQLException;

import com.nt.bo.FinanceEmployeeBO;
import com.nt.bo.HREmployeeBO;
import com.nt.dao.FinanceEmployeeDAOImpl;
import com.nt.dao.HREmployeeDAOImpl;
import com.nt.dao.IFinanceEmployeeDAO;
import com.nt.dao.IHREmployeeDAO;
import com.nt.exception.EmployeeRegistrationProblemException;
import com.nt.factory.ConnectionFactory;
import com.nt.vo.EmployeeVO;

public class EmployeeMgmtBusinessDelegateImpl implements IEmployeeMgmtBusinessDelegate {
	  private  IFinanceEmployeeDAO  financeDAO;
	  private   IHREmployeeDAO   hrDAO;
	public EmployeeMgmtBusinessDelegateImpl() {
		  financeDAO=new  FinanceEmployeeDAOImpl();
		  hrDAO=new HREmployeeDAOImpl();
	}

	public String registerEmployee(EmployeeVO vo) throws SQLException, Exception {
		//convert VO class obj  to two BO class objs  (case1)
		FinanceEmployeeBO  financeBO=new FinanceEmployeeBO();
		financeBO.setEmpName(vo.getEmpName());
		financeBO.setEmpDesg(vo.getEmpDesg());
		financeBO.setEmpAddrs(vo.getEmpAddrs());
		financeBO.setSalary(Double.parseDouble(vo.getSalary()));
		
		HREmployeeBO  hrBO=new HREmployeeBO();
		hrBO.setEmpName(vo.getEmpName());
		hrBO.setEmpDesg(vo.getEmpDesg());
		hrBO.setEmpAddrs(vo.getEmpAddrs());
		boolean flag1=false,flag2=false;
		Connection con=null;
		String resultMsg=null;
		try {
			//get jdbc  connection from Connector factory
			   con=ConnectionFactory.getPooledJdbcConnection();
			  //Begin Tx  (case3)
			  con.setAutoCommit(false);
			//  use DAO class objects
             flag1=hrDAO.insertEmployee(con, hrBO);
             flag2=financeDAO.insertEmployee(con, financeBO);
             
              if(flag1==true && flag2==true) {
            	  con.commit();  // commit Tx  (case3)
            	  resultMsg="Employee registration successfull";
              }
              else {
            	  con.rollback();  //rollback Tx (case3)
            	  resultMsg="Employee registration failed";
              }
		}//try
		catch(SQLException se) {
			se.printStackTrace();
			try {
				con.rollback();  //rollback Tx case3
				resultMsg="Employee registration failed";
			}
			catch(SQLException se1) {
				se1.printStackTrace();
				  //translating  DAO generated technology sepecific execeptions to  Project specific user-defined exception
				throw  new  EmployeeRegistrationProblemException(se1.getMessage());  //case2
			}
			throw  new  EmployeeRegistrationProblemException(se.getMessage());  //case2
		}//catch
		catch(Exception e) {
			e.printStackTrace();
			try {
				con.rollback();  ////rollback Tx case3
				resultMsg="Employee registration failed";
			}
			catch(SQLException se1) {
				se1.printStackTrace();
				
				throw  new  EmployeeRegistrationProblemException(e.getMessage());  //case2
			}
			throw  new  EmployeeRegistrationProblemException(e.getMessage()); //case2
		}//catch
		finally {
			try {
				if(con!=null)
					con.close();
			}//try
			catch(Exception e) {
				e.printStackTrace();
			}
		}//finally
		
		return resultMsg;
	}//method

}//class
