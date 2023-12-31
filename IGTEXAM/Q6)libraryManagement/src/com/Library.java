package com;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<Book>();

    public void addBook(Book bobj) {
        bookList.add(bobj);
    }

    public boolean isEmpty() {
        return bookList.isEmpty();
    }

    public ArrayList<Book> viewAllBooks() {
        return bookList;
    }

    public ArrayList<Book> viewBooksByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<Book>();
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public int countnoofbook(String bname) {
        int count = 0;
        for (Book book : bookList) {
            if (book.getBookName().equalsIgnoreCase(bname)) {
                count++;
            }
        }
        return count;
    }
}
