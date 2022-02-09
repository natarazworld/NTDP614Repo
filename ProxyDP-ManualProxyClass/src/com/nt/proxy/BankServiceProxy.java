package com.nt.proxy;

import com.nt.real.BankServiceImpl;
import com.nt.real.IBankService;

public class BankServiceProxy implements IBankService {
	
	private IBankService real=null;
	
	public BankServiceProxy() {
		real=new BankServiceImpl(); //object for real class
	}

	@Override
	public String withdraw(long acno, float amount) {
		System.out.println("BankServiceProxy.withdraw()-- Proxy class");
		String result=null;
		if(amount<=4000)
			result=real.withdraw(acno, amount);
		else 
			throw new IllegalArgumentException("you  can not withdraw more than 4000 during the demonitation");
		return result;
	}//method

}
