package com.annum.www;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String ISBN;

    // Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    // toString method to display book information
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}

class Library {
    private List<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the collection
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    // Method to remove a book from the collection
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed: " + book);
        } else {
            System.out.println("Book not found in the collection.");
        }
    }

    // Method to display all books in the collection
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("Books in the collection:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

public class Main_Books {
    public static void main(String[] args) {
        Library library = new Library();

        // Creating book instances
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "1234567890");
        Book book2 = new Book("1984", "George Orwell", "0987654321");

        // Adding books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Displaying all books in the library
        library.displayBooks();

        // Removing a book from the library
        library.removeBook(book1);

        // Displaying remaining books
        library.displayBooks();
    }
}

