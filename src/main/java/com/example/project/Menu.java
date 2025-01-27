package com.example.project;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\033[H\033[2J");
        System.out.println( "██████╗  ██████╗  ██████╗ ██╗  ██╗███████╗████████╗ ██████╗ ██████╗ ███████╗\r\n" + //
                            "██╔══██╗██╔═══██╗██╔═══██╗██║ ██╔╝██╔════╝╚══██╔══╝██╔═══██╗██╔══██╗██╔════╝\r\n" + //
                            "██████╔╝██║   ██║██║   ██║█████╔╝ ███████╗   ██║   ██║   ██║██████╔╝█████╗  \r\n" + //
                            "██╔══██╗██║   ██║██║   ██║██╔═██╗ ╚════██║   ██║   ██║   ██║██╔══██╗██╔══╝  \r\n" + //
                            "██████╔╝╚██████╔╝╚██████╔╝██║  ██╗███████║   ██║   ╚██████╔╝██║  ██║███████╗\r\n" + //
                            "╚═════╝  ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚══════╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝\r\n");
        System.out.println("----------------------------------------------------------------------------\n" +
                           "Press 0 to Exit\n" + "Press 1 to Add a new Book\n" + "Press 2 to Change Quantity of a Book\n" + "Press 3 to Search for a Book\n" + "Press 4 to Show Books\n" + "Press 5 to Add User\n" + "Press 6 to Show Users\n" + "Press 7 to Check Out Book\n" + "Press 8 to Check In Book");
        input.nextInt();
    }
}
