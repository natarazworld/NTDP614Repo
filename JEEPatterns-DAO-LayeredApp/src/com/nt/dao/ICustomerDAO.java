package com.nt.dao;

import java.sql.SQLException;

import com.nt.model.Customer;

public interface ICustomerDAO {
     public  int  insertCustomer(Customer coutomer)throws SQLException;
}
