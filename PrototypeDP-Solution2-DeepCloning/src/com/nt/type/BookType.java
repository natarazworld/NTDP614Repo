// abstrct super class
package com.nt.type;

import java.util.ArrayList;
import java.util.List;

import com.nt.model.Book;

public abstract class BookType  implements Cloneable {
	private  String  type;
	private  List<Book> booksList=new ArrayList();
	  //generate getters & setters
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Book> getBooksList() {
		return booksList;
	}
	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}
	@Override
	public String toString() {
		return "BookType [type=" + type + ", booksList=" + booksList + "]";
	}
	
	public abstract  void  loadBooks();

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}
