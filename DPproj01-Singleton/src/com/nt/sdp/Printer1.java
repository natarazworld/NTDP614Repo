//Singleton Java with Minimum standards
package com.nt.sdp;

public class Printer1 {
	//private static ref variable
	private static  Printer1  INSTANCE= new Printer1();  //Singleton logic through eager Instantiation
	
	//private  cosntructor
	private Printer1() {
		System.out.println("Printer1:: 0-param constructor");
	}
	
	
	//static factory method 
	 public static   Printer1 getInstance() {
		 return INSTANCE;
	 }
	
	
		
	
	//b.method
	public  void  printMessage(String msg) {
		System.out.println(msg);
	}

}
