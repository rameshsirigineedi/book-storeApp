package com.ram.bookstoreApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ram.bookstoreApp.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
