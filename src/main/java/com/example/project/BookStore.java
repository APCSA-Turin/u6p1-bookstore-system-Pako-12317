package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books;
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
        
    }
    // public void removeUser(User user){}
    public void removeUser(User user){
        for (int userI = 0; userI<users.length; userI++) {
            if (users[userI].equals(user)) {
                users[userI] = null;
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
    public void addBook(Book book){
        books[books.length - 1] = book;
    }

    // public void insertBook(Book book, int index){}
    public void insertBook(Book book, int index){
        books[index] = book;
    }

    // public void removeBook(Book book){}
    public void removeBook(Book book){
        for (int i = 0; i < books.length; i++) {
            if(books[i] == book){
                books[i] = null;
            }
        }
    }
       
    // public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

}