//Singleton Java class (Perfect singleton)
package com.nt.sdp;

import com.nt.commons.CommonsUtils;

public class Printer2 extends CommonsUtils {
	
	private static boolean   isInstantiated=false;
	//private  cosntructor
	private Printer2() {
		if(isInstantiated)
			throw new RuntimeException(" Object is alredy created");
		else
			isInstantiated=true;
		System.out.println("Printer2:: 0-param constructor");
	}
	
	//static inner class/nested class /nested inner class
	 private static class  Printer2Inner{
		    private  static Printer2 INSTANCE=new Printer2();  // Inner class based eager instannation
	 }                                                                                                //(Front outter is is lazy instantiation)
	
	
	//static factory method 
	 public static   Printer2 getInstance() {
		 return  Printer2Inner.INSTANCE;
	 }
	
	 
	 @Override  //(Protection from cloning)
		public Object clone() throws CloneNotSupportedException {
		     throw new CloneNotSupportedException("In This singleton class is restricted");
		}
	
	
	 ////(Protection from DeSerilization)
	 public  Object readResolve() {
			return  Printer2Inner.INSTANCE;
		}
		
	
	//b.method
	public  void  printMessage(String msg) {
		System.out.println(msg);
	}

}
