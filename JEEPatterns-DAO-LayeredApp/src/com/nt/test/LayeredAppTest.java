package com.nt.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.nt.controller.CustomerOperationsController;
import com.nt.model.Customer;

public class LayeredAppTest {

	public static void main(String[] args) {
		//Gather details from enduser
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  customer name::");
		String name=sc.next();
		System.out.println("Enter  customer address::");
		String addrs=sc.next();
		System.out.println("Enter Customer Bill Amount::");
		float  amount=sc.nextFloat();
		//create  Customer class object havig data collected from enduser
		Customer cust=new Customer();
		cust.setCname(name);
		cust.setCadd(addrs);
		cust.setBillAmt(amount);
		//create Constroller class object
		CustomerOperationsController controller=new CustomerOperationsController();
		//invoke the method
		try {
			String resultMsg=controller.processCustomerForRegistration(cust);
			System.out.println(resultMsg);
		}
		catch(SQLException se) {
			System.out.println(se.getMessage()+" Problem is raised");
			se.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+"  problem is raised");
			e.printStackTrace();
		}
		

	}//main
}//class
