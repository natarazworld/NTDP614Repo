package com.nt.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.nt.bo.HREmployeeBO;

public interface IHREmployeeDAO extends IEmployeeDAO {
      public boolean  insertEmployee(Connection con,HREmployeeBO hrBO)throws SQLException,Exception;
}
