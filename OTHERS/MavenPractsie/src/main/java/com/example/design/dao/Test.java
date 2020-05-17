package com.example.design.dao;

public class Test {

	public static void main(String[] args) {

		BookDao bookDao = new BookDaoImpl();

		// createRecord
		Books b = new Books();
		b.setBookName("HarryPotter");
		b.setIsbn(101);

		bookDao.saveBook(b);
		System.out.println("Created---> " + b.toString());
		System.out.println("Created-List---> " + BookDaoImpl.books);

		System.out.println("===================================================");
		// getAll
		System.out.println("get-All ---> " + BookDaoImpl.books.toString() + "\n");
		System.out.println("===================================================");
		// getById
		System.out.println("getById---> " + bookDao.getBookByIsbn(3));
		System.out.println("getById-List---> " + BookDaoImpl.books);

		System.out.println("===================================================");
		// update student
		BookDaoImpl.books.remove(0);
		Books book = new Books();
		book.setIsbn(5);
		book.setBookName("Algorithms");
		 
		
		 
		bookDao.saveBook(book);
		System.out.println("Updated-List---> " + BookDaoImpl.books.toString());
		System.out.println("===================================================");

		bookDao.deleteBook(b);
		System.out.println("Deleted-List---> " + BookDaoImpl.books.toString());
	}
}
