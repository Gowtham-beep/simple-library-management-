# Library Management System

A simple Java project demonstrating core Object-Oriented Programming (OOP) concepts: **classes, encapsulation, abstraction, inheritance, polymorphism, and enums**.  
This project is structured as a Maven application.

## Features

- Add new books to the library
- Borrow books as a user
- Represent users (students, librarians) using inheritance and abstraction
- Manage book status using enums

## OOP Concepts Used

| Concept        | Where Used                              |
|----------------|-----------------------------------------|
| Classes        | Book, User, Student, Librarian, Service |
| Encapsulation  | Private fields, getters/setters         |
| Inheritance    | Student/Librarian extend User           |
| Abstraction    | User is abstract                        |
| Polymorphism   | Methods accept User (supertype)         |
| Enum           | BookStatus for AVAILABLE/BORROWED       |

## Project Structure

```
library-management-system/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── yourname/
                    └── library/
                        ├── model/
                        │   ├── Book.java
                        │   ├── User.java
                        │   └── Student.java
                        │   └── Librarian.java
                        │   └── BookStatus.java
                        ├── service/
                        │   └── LibraryService.java
                        └── LibraryApp.java
```

## Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourname/library-management-system.git
   cd library-management-system
   ```

2. **Build the project:**
   ```bash
   mvn clean compile
   ```

3. **Run the application:**
   ```bash
   mvn exec:java -Dexec.mainClass="com.yourname.library.LibraryApp"
   ```

## How to Use

Change the logic in `LibraryApp.java` for custom demo scenarios:

```java
LibraryService library = new LibraryService();
Book book = new Book("ISBN123", "Effective Java", "Joshua Bloch");
library.addBook(book);

User student = new Student("Alice");
library.borrowBook("ISBN123", student);
```

## Prerequisites

- Java 17+
- Maven 3.6+

## License

For learning/demo purposes. Feel free to use, adapt, or contribute!
