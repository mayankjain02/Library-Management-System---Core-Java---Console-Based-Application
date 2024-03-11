package com.jsp.lms.view;

import java.util.Scanner;

import com.jsp.lms.controller.Controller;
import com.jsp.lms.model.Book;
import com.jsp.lms.model.Library;

public class View {
	static private Library Library = new Library();

	public static Library getLibrary() {
		return Library;
	}

	public static void setLibrary(Library library) {
		Library = library;
	}

	static Scanner myInput = new Scanner(System.in);
	static Controller controller = new Controller();
	static {
		System.out.println("==========Welcome to Library Management System==========");
		System.out.print("Enter name of the library: ");
		// normal method of setting a value
		String libraryName = myInput.nextLine();
		Library.setLibraryName(libraryName);
		// direct method of storing a value
		System.out.print("Enter the Address of the Library: ");
		Library.setLibraryAddress(myInput.nextLine());
		// direct method for int
		System.out.print("Enter the Pincode of library: ");
		Library.setPincode(myInput.nextInt());
		myInput.nextLine();
		System.out.println("\n");
	}

	public static void main(String[] args) {
//		System.out.println("Name :" + Library.getLibraryName());
//		System.out.println("Address :" + Library.getLibraryAddress());
//		System.out.println("Pincode :" + Library.getPincode());
		do {
			System.out.println("Select the option to perform :");
			System.out.println("1.Add book\n2.Remove book\n3.Update book\n4.Get book\n0.Exit");
			System.out.print("enter digit respective to desired option : ");
			byte userChoice = myInput.nextByte();
			myInput.nextLine();
			System.out.println();//for line space in console
			switch (userChoice) {
			case 1:
				Book book = new Book();
				System.out.print("Enter the Book Name : ");
				book.setBookName(myInput.nextLine());
				System.out.print("Enter the Author Name :");
				book.setBookAuthor(myInput.nextLine());
				System.out.print("Enter the price :");
				book.setBookPrice(myInput.nextDouble());
				myInput.nextLine();
				controller.addBook(book);
				System.out.println("==========Book has been added successfully!!!==========");
				break;
			case 2:
				System.out.print("Enter the book to be removed :");
				String bookToRemove = myInput.nextLine();
				// below statement returns boolean value . !! i.e [ .remove method returns
				// boolean value]
				if (controller.Removebook(bookToRemove)) {// decision making statement (if executes if true)
					System.out.println("==========Book removed Successfully==========");
				} else {
					System.out.println("==========Book does not exist and cannot be removed==========");
				}
				break;
			case 3:
				System.out.print("Enter the book name to Update:");
				Book bookExist = controller.getBook(myInput.nextLine());
				Book bookToUpdate = bookExist;
				if (bookExist != null) { // if book exists
					System.out.println("What details to Update?");
					System.out.println("1.Book name\n2.Author name\n3.Book price");
					System.out.print("Enter digit respective to the option : ");
					byte updateChoice = myInput.nextByte();
					myInput.nextLine();
					switch (updateChoice) {
					case 1:
						System.out.print("Enter the book name to Update :");
						bookToUpdate.setBookName(myInput.nextLine());
						break;

					case 2:
						System.out.print("Enter the Author name to update :");
						bookToUpdate.setBookAuthor(myInput.nextLine());
						break;

					case 3:
						System.out.print("Enter the updated book Price :");
						double newBookPrice = myInput.nextDouble();
						myInput.nextLine();
						bookToUpdate.setBookPrice(newBookPrice);
						break;
					default:
						System.out.println("Please Select the correct option!!!");
						break;
					}
				} else {
					System.out.println("===========Book doesnt exist, Updation cannot be performed=========");
				}
				if(controller.update(bookExist,bookToUpdate)){
					System.out.println("======Updation completed successfully!!!=======");
				}else{
					System.out.println("==========Updation Failed //??==========");
				}
				break;
			case 4:
				System.out.print("Enter the book you are looking for :");
				System.out.println();//for a line space in console
				Book fetchedBook = controller.getBook(myInput.nextLine()); // returns the book object
				if (fetchedBook != null) { // decision making statement for checking if the result is not null and
											// contains object of the book.
					System.out.println("===========Book is available==========");
					System.out.println("Details of the book are :");
					System.out.println(fetchedBook);
				} else {
					System.out.println("==========Book does not Exist==========");
				}

				break;
			case 0:
				myInput.close();
				System.out.println("=============Exited=============");
				System.exit(0);

				break;

			default:
				System.out.println("==========Invalid Option!!!==========");
				break;
			}
			System.out.println();
		} while (true);

	}
}
