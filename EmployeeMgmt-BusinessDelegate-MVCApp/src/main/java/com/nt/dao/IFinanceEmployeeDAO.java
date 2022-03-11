package com.nt.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.nt.bo.FinanceEmployeeBO;

public interface IFinanceEmployeeDAO extends IEmployeeDAO {
      public boolean  insertEmployee(Connection con,FinanceEmployeeBO financeBO)throws SQLException,Exception;
}
