//Singleton Java with Minimum standards
package com.nt.sdp;

import com.nt.commons.CommonsUtils;

public class Printer extends CommonsUtils {
	
	//private static final long serialVersionUID = 1L;
	int a=10;
	//private static ref variable
	private static  Printer  INSTANCE;

	private static boolean   isInstantiated=false;
	//private  cosntructor
	private Printer() {
		if(isInstantiated)
			throw new RuntimeException(" Object is alredy created");
		else
			isInstantiated=true;
		System.out.println("Printer:: 0-param constructor");
	}
	
	/*	//public  static factory method having singleton logic
		public  static Printer getInstance() {
			 //singleton logic
			    if(INSTANCE==null)
			    	  INSTANCE=new Printer();
			    
			    return INSTANCE;
		}*/
	
	
	/*	//public synchorized static factory method having singleton logic
				public synchronized  static Printer getInstance() {
					 //singleton logic
					    if(INSTANCE==null) {
					    	try {
					          Thread.sleep(10000);
					    	}//try
					    	catch(Exception e) {
					    		e.printStackTrace();
					    	}//catch
					    	INSTANCE=new Printer();
					    }//if
					    
					    return INSTANCE;
				}//method
	*/	
	
	//public static factory method having singleton logic in synchronized block
	public   static Printer getInstance() {
		
	if(INSTANCE==null) {  //1st NULL check 
		 //singleton logic
		 synchronized(Printer.class)  // class level locking (static properties will be locked)
		 {
		    if(INSTANCE==null) {   //2nd NULL check
		    	INSTANCE=new Printer();
	    }//if
		 }//synchronized
	}//if
		    
		    return INSTANCE;
	}//method
	
	
	/*@Override
	public Object clone() throws CloneNotSupportedException {
	      return INSTANCE;
	}
	*/
	
		@Override  //(Best solution)
		public Object clone() throws CloneNotSupportedException {
		     throw new CloneNotSupportedException("In This singleton class is restricted");
		}
	
		
		/*	public  Object readResolve() {
				throw new IllegalArgumentException("Deseriazation is not allowed on this class");
			}*/
		
		public  Object readResolve() {
			return  INSTANCE;
		}
		
	
	//b.method
	public  void  printMessage(String msg) {
		System.out.println(msg);
	}

}
