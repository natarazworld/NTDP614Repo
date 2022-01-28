//target class
package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class ECommerceStore {
	//HAS-A property
	private  Courier  courier;
	
	public ECommerceStore() {
		System.out.println("ECommerceStore: 0-param constructor");
	}
	
	//setter method  to assign  the dynamically choosen dependent class object
	 // to target class obj 
	public void  setCourier(Courier courier) {
		this.courier=courier;
		System.out.println("ECommerceStore.setCourier(-)");
	}
	
	// b.method in target classs
	 public  String shopping(String[] items, double[] prices) {
		 //calc bill amount
		 double billAmt=0.0;
		 for(double  price:prices)
			 billAmt+=price;
		 String billMsg=Arrays.toString(items)+" with prices"+Arrays.toString(prices)+" Bill Amount::"+billAmt;
		 //deliver products
		    //generat order id
		 int oid=new Random().nextInt(1000);
		  //deliver products
		 String deliverMsg=courier.deliverOrder(oid);
		 return  billMsg+"\n====="+deliverMsg;
		 
	 }

}
