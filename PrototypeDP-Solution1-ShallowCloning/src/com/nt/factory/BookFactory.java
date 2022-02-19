//Factory class
package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.type.BookType;
import com.nt.type.FictionalBooks;
import com.nt.type.NonFictionalBooks;

public class BookFactory {
	 private  static  Map<String,BookType>  cacheMap=new HashMap();
	  static {
		  BookType fictionalBooks=new FictionalBooks();
		  fictionalBooks.loadBooks();
		  BookType  non_fictionalBooks=new NonFictionalBooks();
		  non_fictionalBooks.loadBooks();
		  cacheMap.put("fictional", fictionalBooks);
		  cacheMap.put("non-fictional",non_fictionalBooks);
	  }

	public  static  BookType    getBooks(String type) throws Exception{
		   BookType clonedBooks=(BookType)cacheMap.get(type).clone();  //shallow cloning
		   return  clonedBooks;
	}
	
}
