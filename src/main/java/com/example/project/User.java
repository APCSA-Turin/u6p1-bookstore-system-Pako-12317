package com.example.project;

public class User {
    private String name;
    private String Id;
    private Book[] book = new Book[5];

    // Constructor to initialize name, Id, and book list
    public User(String name, String Id) {
        this.name = name;
        this.Id = Id;
        for (int i = 0; i < book.length; i++) {
            book[i] = new Book("empty", "empty", 0, "empty", 0); // Using Book's constructor with all attributes
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Id
    public String getId() {
        return Id;
    }

    // Setter for Id
    public void setId(String Id) {
        this.Id = Id;
    }

    // Getter for books
    public Book[] getBooks() {
        return book;
    }

    // Setter for books
    public void setBooks(Book[] books) {
        this.book = books;
    }

    // Returns the book list as a formatted string
    public String bookListInfo() {
        StringBuilder bookInfo = new StringBuilder();
        for (Book b : book) {
            if (b != null && b.getTitle().equals("empty") && b.getAuthor().equals("empty")) {
                bookInfo.append("empty\n");
            } else if (b != null) {
                bookInfo.append(b.bookInfo()).append("\n"); // Calls bookInfo() from Book class
            } else {
                bookInfo.append("empty\n");
            }
        }
        return bookInfo.toString();
    }

    // Returns user information as a formatted string
    public String userInfo() {
        return "Name: " + name + "\nId: " + Id + "\nBooks: \n" + bookListInfo();
    }
}