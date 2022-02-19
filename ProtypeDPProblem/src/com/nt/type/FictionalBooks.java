//Concrete class2
package com.nt.type;

import com.nt.model.Book;

public class FictionalBooks extends BookType {

	@Override
	public void loadBooks() {
		   //hit the  Db s/w and gets the books
		  for(int i=1;i<=5;++i) {
			  Book book=new Book();
			  book.setBookId(i+1);
			  book.setBookName("Book::"+i);
              getBooksList().add(book);			  
		  }//for
		setType("Finctional");
	}//loadBooks()
}//class
