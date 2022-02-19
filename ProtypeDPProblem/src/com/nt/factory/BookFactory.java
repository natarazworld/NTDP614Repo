//Factory class
package com.nt.factory;

import com.nt.type.BookType;
import com.nt.type.FictionalBooks;
import com.nt.type.NonFictionalBooks;

public class BookFactory {

	public  static  BookType    getBook(String type) {
		  BookType bType=null;
		   if(type.equalsIgnoreCase("fictional")) {
			   bType= new FictionalBooks();
			   bType.loadBooks();
		   }
		   else if(type.equalsIgnoreCase("non-fictional")) {
			   bType= new NonFictionalBooks();
			   bType.loadBooks();
		   }
		   else
			   throw new IllegalArgumentException("Invalid  BookType");
		   
		   return  bType;
	}
	
}
