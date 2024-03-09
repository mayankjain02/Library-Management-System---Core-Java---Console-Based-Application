# Library-Management-System---Core-Java---Console-Based-Application
__INTRODUCTION FOR CONTROLLER__
This Java class, named `Controller`, appears to be part of a simple library management system. It contains methods for adding, removing, updating, and retrieving books from a library. The class has a dependency on a `Library` object, which is obtained from a static method `View.getLibrary()`.
![Screenshot 2024-03-09 155944](https://github.com/mayankjain02/Library-Management-System---Core-Java---Console-Based-Application/assets/161832255/b2433c7f-80d8-4d18-b41f-e6d139afac3c)
Here's a brief overview of the key methods:

1. **addBook(Book book):**
   - Adds a book to the library.
   - Checks if the list of books in the library is null. If null, initializes a new ArrayList.
   - Adds the provided book to the list of books in the library.

2. **removeBook(String bookname):**
   - Removes a book from the library based on its name.
   - Uses the `getBook(String bookName)` method to retrieve the book.
   - If the book is found, removes it from the list of books in the library.

3. **update(Book bookExist, Book bookUpdate):**
   - Updates the information of a book in the library.
   - Iterates through the list of books to find the book to be updated (based on the provided `bookExist`).
   - Removes the existing book from the list and adds the updated book.

4. **getBook(String bookName):**
   - Retrieves a book from the library based on its name.
   - Iterates through the list of books to find a book with a matching name.
   - Returns the book if found, otherwise returns null.
