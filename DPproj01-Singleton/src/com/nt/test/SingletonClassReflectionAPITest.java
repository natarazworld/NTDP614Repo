package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.sdp.Printer3;

public class SingletonClassReflectionAPITest {

	public static void main(String[] args) {
		
		/*try {
			//Load the singleton  java class
			Class c=Class.forName("com.nt.sdp.Printer");
			     //(or)
			//Class c= Printer.class;
			// get all the Declared constructors of the class
			Constructor cons[]=c.getDeclaredConstructors();
			//get Access Private construtor (if any)
			cons[0].setAccessible(true);
			//create objects for  singleton java class using the accessed private constructor
			Printer p=Printer.getInstance();
			Printer p1=(Printer)cons[0].newInstance();
			Printer p2=(Printer)cons[0].newInstance();
			System.out.println(p.hashCode()+"   "+p1.hashCode()+"  "+p2.hashCode());
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*System.out.println("=========================================");
		
		try {
			//Load the singleton  java class
			Class c=Class.forName("com.nt.sdp.Printer2");
			     //(or)
			//Class c= Printer2.class;
			// get all the Declared constructors of the class
			Constructor cons[]=c.getDeclaredConstructors();
			//get Access Private construtor (if any)
			cons[0].setAccessible(true);
			//create objects for  singleton java class using the accessed private constructor
			Printer2 p=Printer2.getInstance();
			Printer2 p1=(Printer2)cons[0].newInstance();
			Printer2 p2=(Printer2)cons[0].newInstance();
			System.out.println(p.hashCode()+"   "+p1.hashCode()+"  "+p2.hashCode());
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		
System.out.println("=========================================");
		
		try {
			//Load the singleton  java class
			Class c=Class.forName("com.nt.sdp.Printer3");
			     //(or)
			//Class c= Printer2.class;
			// get all the Declared constructors of the class
			Constructor cons[]=c.getDeclaredConstructors();
			//get Access Private construtor (if any)
			cons[0].setAccessible(true);
			//create objects for  singleton java class using the accessed private constructor
			Printer3 p=Printer3.getInstance();
			Printer3 p1=(Printer3)cons[0].newInstance();
			Printer3 p2=(Printer3)cons[0].newInstance();
			System.out.println(p.hashCode()+"   "+p1.hashCode()+"  "+p2.hashCode());
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		
				
	}//main
}//class
