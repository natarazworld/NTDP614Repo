package com.nt.delegate;

import java.io.IOException;
import java.sql.SQLException;

import com.nt.vo.EmployeeVO;

public interface IEmployeeMgmtBusinessDelegate {
    public String   registerEmployee(EmployeeVO vo)throws SQLException,Exception;
}
