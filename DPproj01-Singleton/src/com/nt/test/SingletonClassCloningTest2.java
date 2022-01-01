package com.nt.test;

import com.nt.sdp.Printer3;

public class SingletonClassCloningTest2 {

	public static void main(String[] args) {
		/*  //get Singleton java class object
		Printer p1=Printer.getInstance();
		try {
		  Printer p2=(Printer)p1.clone();
		  System.out.println(p1.hashCode()+"   "+p2.hashCode());
		  System.out.println("p1==p2?"+(p1==p2));
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		
		/*		  //get Singleton java class object
						Printer2 p1=Printer2.getInstance();
						try {
						  Printer2 p2=(Printer2)p1.clone();
						  System.out.println(p1.hashCode()+"   "+p2.hashCode());
						  System.out.println("p1==p2?"+(p1==p2));
						}
						catch(Exception e) {
							e.printStackTrace();
						}
		*/				
				
		/*	 //get Singleton java class object
			Printer3 p1=Printer3.getInstance();
			try {
			  Printer3 p2=(Printer3)p1.clone();  //cloning not possible on the constants of Enum
			  System.out.println(p1.hashCode()+"   "+p2.hashCode());
			  System.out.println("p1==p2?"+(p1==p2));
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
				
	}//main
}//class
