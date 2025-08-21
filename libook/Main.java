package com.grindingjava.learning.libook;

public class Main {
    public static void main(String[] args) {
        book[] myLibrary = new book[2];

        myLibrary[0] = new Digital("AI dominance","Gopal",23);
        myLibrary[1] = new Physical("Can't hurt me","David Goggins",5000);

        System.out.println("--- My Library Details ---");

        for (book book : myLibrary) {
            book.displayDetails();
        }
    }
}
