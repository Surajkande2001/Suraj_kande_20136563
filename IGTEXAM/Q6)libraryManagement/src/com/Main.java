package com;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Display all book details");
            System.out.println("3. Search Book by author");
            System.out.println("4. Count number of books - by book name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Book book = new Book();
                    System.out.print("Enter the isbn no: ");
                    book.setIsbnno(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Enter the book name: ");
                    book.setBookName(scanner.nextLine());
                    System.out.print("Enter the author name: ");
                    book.setAuthor(scanner.nextLine());
                    library.addBook(book);
                    break;
                case 2:
                    ArrayList<Book> allBooks = library.viewAllBooks();
                    if (allBooks.isEmpty()) {
                        System.out.println("The list is empty");
                    } else {
                        for (Book b : allBooks) {
                            System.out.println("ISBN no: " + b.getIsbnno());
                            System.out.println("Book name: " + b.getBookName());
                            System.out.println("Author name: " + b.getAuthor());
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the author name: ");
                    String author = scanner.nextLine();
                    ArrayList<Book> booksByAuthor = library.viewBooksByAuthor(author);
                    if (booksByAuthor.isEmpty()) {
                        System.out.println("None of the book published by the author " + author);
                    } else {
                        for (Book b : booksByAuthor) {
                            System.out.println("ISBN no: " + b.getIsbnno());
                            System.out.println("Book name: " + b.getBookName());
                            System.out.println("Author name: " + b.getAuthor());
                            System.out.println();
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter the book name: ");
                    String bookName = scanner.nextLine();
                    int count = library.countnoofbook(bookName);
                    System.out.println("Count is " + count);
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
        scanner.close();
    }
}
