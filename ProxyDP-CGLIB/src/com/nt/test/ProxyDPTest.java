package com.nt.test;

import com.nt.factory.BankServiceFactory;
import com.nt.real.BankServiceImpl;

public class ProxyDPTest {

	public static void main(String[] args) {
		//======= During Demonitatizatio ======
		try {
		BankServiceImpl  service=BankServiceFactory.getInstance(true);
		System.out.println("service object class name::"+service.getClass().getName());
		String result=service.withdraw(133554L, 56789.0f);  //more than 4000
		System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("=============================");
		//======= During Demonitatization ======
		try {
			BankServiceImpl  service= BankServiceFactory.getInstance(true);
			System.out.println("service object class name::"+service.getClass().getName());
			String result=service.withdraw(133554L, 2000.0f);  //less than 4000
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//======= During Normal days ======
		System.out.println("=============================");
		try {
			BankServiceImpl  service= BankServiceFactory.getInstance(false);
			System.out.println("service object class name::"+service.getClass().getName());
			String result=service.withdraw(133554L, 12000.0f);  //more than 4000
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//main
}//class
