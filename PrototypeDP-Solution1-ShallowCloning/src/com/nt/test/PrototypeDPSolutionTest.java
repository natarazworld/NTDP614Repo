package com.nt.test;

import com.nt.factory.BookFactory;
import com.nt.type.BookType;

public class PrototypeDPSolutionTest {

	public static void main(String[] args) {
		try {
		BookType  fictionalBooks=BookFactory.getBooks("fictional");
		System.out.println(fictionalBooks);
		System.out.println("count ::"+fictionalBooks.getBooksList().size());
		System.out.println("-----------------------------------------");
		BookType  non_fictionalBooks=BookFactory.getBooks("non-fictional");
		System.out.println(non_fictionalBooks);
		
		System.out.println("====================================");
		
		BookType  fictionalBooks1=BookFactory.getBooks("fictional");  //cloned obj
		  //this time loadBooks() will not called becoz they will be collected from cache
		System.out.println(fictionalBooks1);
		System.out.println("-----------------------------------------");
		BookType  non_fictionalBooks1=BookFactory.getBooks("non-fictional"); //cloned obj
		  //this time loadBooks() will not called becoz they will be collected from cache
		System.out.println(non_fictionalBooks1);
		
		//any modification done  original obj or clonned object will be reflected to other object
		   fictionalBooks1.getBooksList().remove(2);
		   System.out.println("cloned object data ::"+fictionalBooks1);  //reflects here
		   System.out.println("count ::"+fictionalBooks1.getBooksList().size());
		   System.out.println("orginal object data::"+fictionalBooks); //reflects here
		   System.out.println("count ::"+fictionalBooks.getBooksList().size());
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		}//main
		
}//class
		
		
		
	