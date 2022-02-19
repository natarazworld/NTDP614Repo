//Real class
package com.nt.real;

public final class BankServiceImpl implements IBankService {

	@Override
	public String withdraw(long acno,  float amount) {
		System.out.println("BankServiceImpl.withdraw() (real class)");
		return "withdrawing amount::"+amount+" from "+acno;
	}

}
