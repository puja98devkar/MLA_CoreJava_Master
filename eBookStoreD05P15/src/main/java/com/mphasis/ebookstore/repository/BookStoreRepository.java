package com.mphasis.ebookstore.repository;

import com.mphasis.ebookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookStoreRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitle(String title);

    List<Book> findByPublisherContaining(String publisher);

    List<Book> findByYear(int year);
}
