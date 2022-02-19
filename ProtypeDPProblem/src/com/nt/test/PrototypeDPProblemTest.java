package com.nt.test;

import com.nt.factory.BookFactory;
import com.nt.type.BookType;

public class PrototypeDPProblemTest {

	public static void main(String[] args) {
		BookType  fictionalBooks=BookFactory.getBook("fictional");
		System.out.println(fictionalBooks);
		System.out.println("-----------------------------------------");
		BookType  non_fictionalBooks=BookFactory.getBook("non-fictional");
		System.out.println(non_fictionalBooks);
		System.out.println("====================================");
		
		BookType  fictionalBooks1=BookFactory.getBook("fictional");
		System.out.println(fictionalBooks1);
		System.out.println("-----------------------------------------");
		BookType  non_fictionalBooks1=BookFactory.getBook("non-fictional");
		System.out.println(non_fictionalBooks1);
		
		
		
		

	}

}
