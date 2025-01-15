package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name;
    private String Id;
    private Book[] book = new Book[5];
    //requires 1 contructor with two parameters that will initialize the name and id
    public User(String name, String Id){
        this.name = name;
        this.Id = Id;
    }
    // public  getName() {}
    public String getName(){
        return name;
    }
    // public  setName() {}
    public void setName(String name){
        this.name = name;
    }
    // public  getId() {}
    public String getId(){
        return Id;
    }
    // public void setId() {}
    public void setId(String Id){
        this.Id = Id;
    }
    // public getBooks() {}
    public Book[] getBooks(){
        return book;
    }
    // public setBooks() {}
    public void setBooks(Book[] books){
        book = books;
    }
    // public String bookListInfo(){} //returns a booklist for the user, if empty, output "empty"
    public String bookListInfo(){
        if (book.equals(null)) {
           return "empty"; 
        } else {
            return book.toString();  
        }
    }
    // public String userInfo(){} //returns  "Name: []\nID: []\nBooks:\n[]"
    public String userInfo(){
        return "Name: " + name + "\nID: " + Id + "\nBooks:\n"+ book;
    }
}