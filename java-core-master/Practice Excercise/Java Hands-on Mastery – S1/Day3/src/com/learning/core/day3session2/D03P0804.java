package com.learning.core.day3session2;

import java.util.*;

class Book1 implements Comparable<Book1> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private Date publicationDate;
 
    public Book1(int bookId, String title, double price, String author, Date publicationDate) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.publicationDate = publicationDate;
    }
 
    // Getters and Setters
 
    public int getBookId() {
        return bookId;
    }
 
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }
 
    public Date getPublicationDate() {
        return publicationDate;
    }
 
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
 
    // Override toString method
    @Override
    public String toString() {
        return bookId + " " + title + "\n" + price + " " + author + "\n" + publicationDate;
    }
 
    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, price, author, publicationDate);
    }
 
    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book1 book = (Book1) obj;
        return bookId == book.bookId &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publicationDate, book.publicationDate);
    }
 
    // Override compareTo method for natural ordering based on author names
    @Override
    public int compareTo(Book1 o) {
        return this.author.compareTo(o.author);
    }
}
 
public class D03P0804 {
    public static void main(String[] args) {
        // Create TreeSet to store Book details
        TreeSet<Book1> bookSet = new TreeSet<>();
 
        // Add predefined book details
        bookSet.add(new Book1(1001, "Python Learning", 715.0, "Martic C. Brown", new Date("2/2/2020")));
        bookSet.add(new Book1(1002, "Modern Mainframe", 295.0, "Sharad", new Date("19/5/1997")));
        bookSet.add(new Book1(1003, "Java Programming", 523.0, "Gilad Bracha", new Date("23/11/1984")));
        bookSet.add(new Book1(1004, "Read C++", 295.0, "Henry Harvin", new Date("19/11/1984")));
        bookSet.add(new Book1(1005, ".Net Platform", 3497.0, "Mark J. Price", new Date("6/3/1984")));
 
        // Print all Book details by sorting the author names in ascending order
        for (Book1 book : bookSet) {
            System.out.println(book);
        }
    }
}
