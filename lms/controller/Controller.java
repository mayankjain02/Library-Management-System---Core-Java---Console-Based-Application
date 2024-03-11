package com.jsp.lms.controller;

import java.util.ArrayList;
import java.util.List;

import com.jsp.lms.model.Book;
import com.jsp.lms.model.Library;
import com.jsp.lms.view.View;

public class Controller {
	private Library library = View.getLibrary();

	// Book is the reference class and book is the type
	public void addBook(Book book) {
		List<Book> books = library.getBooks();
		//check if the book is there or not!!
		if (books == null) {
			//Creates a new AL if the list is not present or book is being added for the first time!!
			books = new ArrayList<>();
		}
		//Adds the book in the AL
		books.add(book);
		//below line will set the books in the library .. It should be books instead of book!!!
		library.setBooks(books);
	}
	public boolean Removebook(String bookname){
		Book book = getBook(bookname);
		if (book != null) {
			List<Book> books = library.getBooks();
			books.remove(book);
			library.setBooks(books);
			return true;
		}
		return false;
	}
	public boolean update(Book bookExist ,Book bookUpdate) {
		List<Book> books = library.getBooks();
		for (Book book : books) {
			if(book.getBookName().equalsIgnoreCase(bookExist.getBookName())){
				books.remove(bookExist);
				books.add(bookUpdate);
				library.setBooks(books);
				return true;
			}
		}
		return false;
	}
	public Book getBook(String bookName) {
		//using library reference created from View.getLibrary on the line 11
		List<Book> books = library.getBooks();
		if(books !=null) {//list of book exist
			for (Book book : books) {
				if(book.getBookName().equalsIgnoreCase(bookName)) {
					return book;
				}
			}
		}
		//if list or the book does not exist than !!
		return null;
	}
}
