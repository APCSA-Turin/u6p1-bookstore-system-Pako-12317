package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books = new Book[5];
    private User[] users = new User[10];
    //requires 1 empty constructor
    public BookStore(){}
    // public getUsers(){}
    public User[] getUsers() {
        return users;
    }
    // public setUsers(){}
    public void setUsers(User[] users) {
        this.users = users;
    }
    // public  getBooks(){}
    public Book[] getBooks() {
        return books;
    }
    // public void addUser(User user){} 
    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }
    }
    // public void removeUser(User user){}
    public void removeUser(User user){
        for (int userI = 0; userI<users.length; userI++) {
            if (users[userI] == user) {
                users[userI] = null;
                consolidateUsers();
                break;
            }
        }
    }
    // public void consolidateUsers(){}
    public void consolidateUsers(){
        User[] newUsers = new User[users.length];
        int newIndex = 0;

        for (User user : users) {
            if (user != null) {
                newUsers[newIndex++] = user;
            }
        }

        users = newUsers;
    }
    // public void addBook(Book book){}
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    // public void insertBook(Book book, int index){}
    public void insertBook(Book book, int index) {
        if (books[index] != null) {
            // Shift books to the right to make space at the specified index
            for (int i = books.length - 1; i > index; i--) {
                books[i] = books[i - 1];
            }
        }
        books[index] = book;
    }

    // public void removeBook(Book book){}
    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                books[i].setQuantity(books[i].getQuantity() - 1);
    
                if (books[i].getQuantity() <= 0) {
                    books[i] = null; // Remove the book if quantity is 0
                }
                break; // Exit loop once the book is found and processed
            }
        }
    
        consolidateBooks(); // Always consolidate after removal
    }
    
    // private void consolidateBooks()
    private void consolidateBooks() {
        Book[] newBooks = new Book[books.length - countNulls()];
        int newIndex = 0;
    
        for (Book book : books) {
            if (book != null) {
                newBooks[newIndex++] = book;
            }
        }
    
        books = newBooks;
    }

        // public int countNulls(){}
    private int countNulls() {
        int nullCount = 0;

        for (Book book : books) {
            if (book == null) {
                nullCount++;
            }
        }

        return nullCount;
    }
       
    // public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

}