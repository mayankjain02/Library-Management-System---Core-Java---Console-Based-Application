# Library-Management-System---Core-Java---Console-Based-Application
__INTRODUCTION FOR CONTROLLER:__

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

__INTRODUCTION TO BOOK :__
The Java class, named `Book`, represents a basic model for storing information about books in a library management system. It encapsulates the details of a book, including its name, author, and price. The class includes getter and setter methods for accessing and modifying these attributes.

__*Attributes*__
-bookName
: Represents the name of the book.
-bookAuthor
: Represents the author of the book.
-bookPrice
: Represents the price of the book.

__*Getter and Setter Methods*__
-getBookName()
: Retrieves the name of the book.
-setBookName(String bookName)
: Sets the name of the book.

-getBookAuthor()
: Retrieves the author of the book.
setBookAuthor(String bookAuthor)
: Sets the author of the book.

-getBookPrice()
: Retrieves the price of the book.
-setBookPrice(double bookPrice)
: Sets the price of the book.

__*toString() Method*__
Overrides the
-toString() method to provide a string representation of the Book.
-object.
Returns a formatted string containing the book's name, author, and price.

__*The `Book` class serves as a data structure to store information about individual books, and it can be used in conjunction with other classes, such as the `Controller` class from the previous code snippet, to manage a collection of books within a library system.*__

__INTRODUCTION TO LIBRARY :__

The Java class, named `Library`, represents a model for a library in a library management system. It encapsulates information about a library, including its name, address, pin code, and a collection of books it holds. The class includes getter and setter methods for accessing and modifying these attributes.

![Screenshot 2024-03-09 164134](https://github.com/mayankjain02/Library-Management-System---Core-Java---Console-Based-Application/assets/161832255/f76a5af5-4f46-43f5-8ac2-a93d5701ddb2)

Here's a brief overview of the key components of the `Library` class:

- **Attributes:**
  - `libraryName`: Represents the name of the library.
  - `libraryAddress`: Represents the address of the library.
  - `pincode`: Represents the pin code or postal code associated with the library.
  - `books`: Represents a collection of `Book` objects, forming the library's inventory.

- **Getter and Setter Methods:**
  - `getLibraryName()`: Retrieves the name of the library.
  - `setLibraryName(String libraryName)`: Sets the name of the library.
  - `getLibraryAddress()`: Retrieves the address of the library.
  - `setLibraryAddress(String libraryAddress)`: Sets the address of the library.
  - `getPincode()`: Retrieves the pin code of the library.
  - `setPincode(int pincode)`: Sets the pin code of the library.
  - `getBooks()`: Retrieves the list of books in the library.
  - `setBooks(List<Book> books)`: Sets the collection of books in the library.

__*The `Library` class serves as a container for information related to a specific library, providing a structured way to manage details about the library itself and the books it contains. This class can be used in conjunction with other components, such as the `Controller` class and the `Book` class, to create a comprehensive library management system.*__

__INTRODUCTION TO VIEW :__

The provided Java class, named `View`, serves as the user interface for a Library Management System. It interacts with the user through the console, allowing them to perform various operations such as adding, removing, updating, and retrieving book information from the library. The class incorporates instances of the `Controller` class for handling business logic and the `Book` and `Library` classes for managing book and library information, respectively.

Here's a brief overview of the key components and functionalities of the `View` class:

- **Attributes:**
  - `Library`: Represents a static instance of the `Library` class, serving as the central repository for book-related operations.

- **Static Initialization Block:**
  - Displays a welcome message and prompts the user to input details about the library (name, address, and pin code) during the program's startup.

- **Main Method:**
  - Presents a menu-driven interface to the user, allowing them to select various options for managing the library.
  - Options include adding a book, removing a book, updating book details, retrieving book information, and exiting the program.

- **Switch Statement:**
  - Uses a switch statement to handle user input and execute the corresponding functionality.
  - Options 1 to 4 trigger operations related to book management, while option 0 exits the program.

- **User Input Handling:**
  - Utilizes a `Scanner` object (`myInput`) for reading user input from the console.
  - Validates and processes user input to perform the desired library operations.

- **Integration with Controller:**


![image](https://github.com/mayankjain02/Library-Management-System---Core-Java---Console-Based-Application/assets/161832255/495308d3-9500-435a-af00-27b3f330a223)

**HOW DOES IT WORKS :**

A console-based Library Management System (LMS) typically operates through a text-based interface, where users interact with the system through a command-line or terminal. Here's a simplified explanation of how a console-based LMS might work:

1. **Initialization:**
   - The system starts by initializing necessary components, such as the database or data structures to store library information.
   - Users are prompted to input details about the library, such as its name, address, and other relevant information.

2. **Menu Display:**
   - A menu is displayed to the user, presenting various options and functionalities available in the LMS.
   - Options may include adding a book, removing a book, updating book details, searching for books, and exiting the system.

3. **User Input:**
   - Users interact with the system by entering commands or selecting options from the menu.
   - For example, a user might input a command to add a new book, providing details like the book's name, author, and price.

4. **Controller Logic:**
   - The console-based LMS is likely to have a controller or manager class that handles the business logic.
   - This class interprets user input, executes the corresponding operations, and interacts with the underlying data structures or database.

5. **Book Operations:**
   - Users can perform various operations related to books, such as:
     - **Adding a Book:** The system creates a new book object and adds it to the library's collection.
     - **Removing a Book:** The system searches for the book by name and removes it from the library.
     - **Updating a Book:** Users may modify details of an existing book, such as the name, author, or price.
     - **Searching for a Book:** Users can search for a book by providing its name, and the system retrieves and displays relevant details.

6. **User Feedback:**
   - The system provides feedback to the user after each operation, confirming the success or failure of the requested action.
   - For example, if a book is successfully added, the system displays a message indicating success.

7. **Continuous Interaction:**
   - The console-based LMS typically operates in a loop, allowing users to perform multiple operations without restarting the system.
   - Users can continue interacting with the system until they choose to exit.

8. **Exiting the System:**
   - When the user decides to exit, they can select the corresponding option from the menu.
   - The system may save any changes made to the library's data and then gracefully terminate.

![image](https://github.com/mayankjain02/Library-Management-System---Core-Java---Console-Based-Application/assets/161832255/77781d4e-c834-4217-904b-a70aa9bffb8d)


Console-based LMSs are lightweight and straightforward, providing basic functionality for managing library resources. They are suitable for scenarios where a graphical user interface is not essential, such as in environments where resources are limited or for educational purposes.

