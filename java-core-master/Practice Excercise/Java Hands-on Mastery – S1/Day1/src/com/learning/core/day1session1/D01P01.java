package com.learning.core.day1session1;
 
public class D01P01 {
    public static Book createBooks(String title, double price) {
        Book book = new Book();
        book.setBookTitle(title);
        book.setBookPrice(price);
        return book;
    }
 
    public static void showBooks(Book book) {
        System.out.println("Book Title: " + book.getBookTitle() + " and Price: " + book.getBookPrice());
    }
 
    public static void main(String[] args) {
        String title = "Java Programming";
        double price = 350.00;
 
        Book myBook = createBooks(title, price);
        showBooks(myBook);
    }
}