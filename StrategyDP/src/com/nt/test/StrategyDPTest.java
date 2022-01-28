//Client App
package com.nt.test;

import com.nt.comps.ECommerceStore;
import com.nt.factory.EcommerceStoreFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		//get Target class object
		ECommerceStore store=EcommerceStoreFactory.getInstance("dhl");
		// invoke b.method
		String resultMsg=store.shopping(new String[] {"shirt","hat"},
				                                                 new double[] {1500, 100});
		System.out.println(resultMsg);
		

	}

}
