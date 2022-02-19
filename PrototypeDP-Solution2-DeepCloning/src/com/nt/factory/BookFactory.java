//Factory class
package com.nt.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nt.model.Book;
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
		   //logic for deep cloning
		    BookType cachedBooks=(BookType)cacheMap.get(type);  
		   BookType clonedBooks=(BookType)cachedBooks.clone(); //outter object cloning
		   //inner List collection and its Book obj clonning
		   List<Book> clonedList=new ArrayList();
		   for(Book b:cachedBooks.getBooksList()) {
			      Book clonedBook=(Book) b.clone();
			      clonedList.add(clonedBook);
		   }
		   // type cloning
		   String clonedType=(String)cachedBooks.getType();
		   // set inner clonned objects to outer object BookType
		    clonedBooks.setBooksList(clonedList);
		    clonedBooks.setType(clonedType);
		   
		   return  clonedBooks;
	}
	
}
