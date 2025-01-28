package com.example.project;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BookStore store = new BookStore();
        int in = 9;
        String inString = "";
        while(in != -1){
            ASCII.printMenu();
            in = input.nextInt();
            input.nextLine();
            if (in == 0) {
                System.out.println("\033[H\033[2J");
                break;
            } else if(in == 1) {
                System.out.println("Title: ");
                String title = input.nextLine();
                System.out.println("Author: ");
                String author = input.nextLine();
                System.out.println("When was the book published?");
                int year = input.nextInt();
                input.nextLine();
                System.out.println("ISBN:");
                String isbn = input.nextLine();
                System.out.println("How many books?");
                int quantity = input.nextInt();
                input.nextLine();
                Book book = new Book(title, author, year, isbn, quantity);
                store.addBook(book);
                in = 9;
            } else if(in == 2) {
                System.out.println("Which book would you like to change the quantity of?");
                inString = input.nextLine();
                System.out.println("What quantity should the book have?");
                in = input.nextInt();
                input.nextLine();
                for (Book book : store.getBooks()) {
                    if(book.getTitle() == inString){
                        book.setQuantity(in);
                    }
                }
            } else if(in == 3) {
                System.out.println();
            } else if(in == 4) {
                String[] bookList = new String[store.getBooks().length];
                for (int i = 0; i < store.getBooks().length; i++) {
                    for (Book book : store.getBooks()) {
                        if(book == null){
                            bookList[i] = null;
                        } else {
                        bookList[i] = book.bookInfo();
                        }
                    }
                }
                System.out.println("\033[H\033[2J");
                for (String string : bookList) {
                    System.out.println(string);
                }
                Time.wait(5000);
            } else if(in == 5) {
                System.out.println();
            } else if(in == 6) {
                System.out.println();
            } else if(in == 7) {
                System.out.println();
            } else if(in == 8) {
                System.out.println();
            } else {
                ASCII.printInvalid();
                Time.wait(1500);
                ASCII.printMenu();
            }
        }
        input.close();
    }
}
