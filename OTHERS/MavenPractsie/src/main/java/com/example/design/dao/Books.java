package com.example.design.dao;

public class Books {
	
	private int isbn;
    private String bookName;
	public Books(int isbn, String bookName) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
	}
	
	
	public Books() {
		super();
	}


	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", bookName=" + bookName + "]";
	}
    
     

}
