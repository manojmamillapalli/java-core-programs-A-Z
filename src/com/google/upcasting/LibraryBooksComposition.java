package com.google.upcasting;


import java.util.ArrayList;
import java.util.Scanner;

class Book1 {
    private String booktitle;

    Book1(String booktitle) {
        this.booktitle = booktitle;
    }

    // Getter for booktitle
    public String getBooktitle() {
        return booktitle;
    }

    // Override toString for easier printing
    @Override
    public String toString() {
        return booktitle;
    }
}

class Library1 {
    private ArrayList<Book1> books;

    Library1() {
        books = new ArrayList<>();
    }

    public void addBook(Book1 book) {
        books.add(book);
    }

    public ArrayList<Book1> getBooks() {
        System.out.println(this.getClass().getSimpleName() + " has a books list of " + books);
        return books;
    }
}

public class LibraryBooksComposition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library1 lb = new Library1();

        System.out.print("Enter the number of books you want to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the title of book " + (i + 1) + ": ");
            String title = scanner.nextLine();
            Book1 book = new Book1(title);
            lb.addBook(book);
        }

        System.out.println("Books in the library:");
        lb.getBooks();
    }
}
