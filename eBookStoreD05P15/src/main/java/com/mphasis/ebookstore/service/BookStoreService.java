package com.mphasis.ebookstore.service;

import com.mphasis.ebookstore.model.Book;
import com.mphasis.ebookstore.repository.BookStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookStoreService {

    @Autowired
    private BookStoreRepository bookStoreRepository;

    public List<Book> getAllBooks() {
        return bookStoreRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookStoreRepository.findById(id);
    }

    public Book addBook(Book book) {
        return bookStoreRepository.save(book);
    }

    public Book updateBook(Long id, Book book) {
        book.setId(id);
        return bookStoreRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookStoreRepository.deleteById(id);
    }

    public List<Book> getBooksByTitle(String title) {
        return bookStoreRepository.findByTitle(title);
    }

    public List<Book> getBooksByPublisher(String publisher) {
        return bookStoreRepository.findByPublisherContaining(publisher);
    }

    public List<Book> getBooksByYear(int year) {
        return bookStoreRepository.findByYear(year);
    }
}
