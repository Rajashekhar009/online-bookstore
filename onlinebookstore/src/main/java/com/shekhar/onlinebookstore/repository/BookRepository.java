package com.shekhar.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shekhar.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
