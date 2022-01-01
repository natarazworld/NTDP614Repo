package com.nt.sdp;

import java.util.HashMap;
import java.util.Map;

public  enum Printer3 {
	 INSTANCE;  //enum constant -->It is internally
	                     //public  static Printer3  INSTANCE=new Printer3()
	public  static   Printer3  getInstance() {
		 return INSTANCE;
	}
	
	
	//b.method
	public  void print(String msg) {
		System.out.println("printing "+msg+"......");
	}
}
