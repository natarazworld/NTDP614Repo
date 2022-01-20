package com.nt.test;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import com.nt.sdp.Printer;
import com.nt.sdp.Printer2;
import com.nt.sdp.Printer3;

public class SingletonClassTestUsingCLassLoader {

	public static void main(String[] args) {
		
	/*	//Problem code
		//==============
		try {
			// Object creation  using ApplicationClassLoader
			System.out.println("===Using ApplicationClassLoader======");
			//Printer p=Printer.getInstance();
			//Printer2 p=Printer2.getInstance();
			Printer3 p=Printer3.getInstance();
			
			System.out.println("------------------------------------");
			
			
			//object creation using  Custom ClassLoader
			System.out.println("===Using URLClassLoader (readymade Custom CLassLoader)======");
			//create the ClassLoader using URLClassLoader
			URLClassLoader loader=
					 new URLClassLoader(new URL[] {new URL("file:/e:/Proj1.jar")},null);  //null -for no parent class loader
			//Load the specific class..
			//Class<?> clazz =loader.loadClass("com.nt.sdp.Printer");
			//Class<?> clazz =loader.loadClass("com.nt.sdp.Printer2");
			Class<?> clazz =loader.loadClass("com.nt.sdp.Printer3");
			//get access to getInstance() method of the loaded class
			Method method=clazz.getDeclaredMethod("getInstance", new Class[] {});
			// invoke the method
			Object obj=method.invoke(null);  // null for no args to pass
			System.out.println(" object has hash codes ::"+obj.hashCode()+"  "+p.hashCode());		
			
		}
		catch(Exception e) {
			e.printStackTrace();
		} */
		

		//Solution  code
		//==============
		try {
			// Object creation  using ApplicationClassLoader
			System.out.println("===Using ApplicationClassLoader======");
			Printer p=Printer.getInstance();
			System.out.println("class Loader:"+p.getClass().getClassLoader());
			//Printer2 p=Printer2.getInstance();
			//Printer3 p=Printer3.getInstance();
			
			System.out.println("------------------------------------");
			
			
			//object creation using  Custom ClassLoader
			System.out.println("===Using URLClassLoader (readymade Custom CLassLoader)======");
			//create the ClassLoader using URLClassLoader
			URLClassLoader loader=
					 new URLClassLoader(new URL[] {new URL("file:/e:/Proj1.jar")}, p.getClass().getClassLoader());  //parent class Looader
			//Load the specific class..
			Class<?> clazz =loader.loadClass("com.nt.sdp.Printer");
			//Class<?> clazz =loader.loadClass("com.nt.sdp.Printer2");
			//Class<?> clazz =loader.loadClass("com.nt.sdp.Printer3");
			//get access to getInstance() method of the loaded class
			Method method=clazz.getDeclaredMethod("getInstance", new Class[] {});
			// invoke the method
			Object obj=method.invoke(null);  // null for no args to pass
			System.out.println(" object has hash codes ::"+obj.hashCode()+"  "+p.hashCode());			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		

	}//main

}//class
