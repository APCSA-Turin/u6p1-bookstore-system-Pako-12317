package com.example.project;

public class testingRunner {
    public static void main(String[] args) {
        IdGenerate n = new IdGenerate();
        n.generateID();
        System.out.print(n.getCurrentId());
        n.generateID();
        System.out.print(n.getCurrentId());
    }
}
