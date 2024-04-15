package com.mphasis.ebookstore.controller;

import com.mphasis.ebookstore.model.Book;
import com.mphasis.ebookstore.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookStoreRestController {

    @Autowired
    private BookStoreService bookStoreService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookStoreService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookStoreService.getBookById(id);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookStoreService.addBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return bookStoreService.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookStoreService.deleteBook(id);
    }

    @GetMapping("/title/{title}")
    public List<Book> getBooksByTitle(@PathVariable String title) {
        return bookStoreService.getBooksByTitle(title);
    }

    @GetMapping("/publisher/{publisher}")
    public List<Book> getBooksByPublisher(@PathVariable String publisher) {
        return bookStoreService.getBooksByPublisher(publisher);
    }

    @GetMapping(params = "year")
    public List<Book> getBooksByYear(@RequestParam int year) {
        return bookStoreService.getBooksByYear(year);
    }
}
