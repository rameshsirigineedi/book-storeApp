package com.ram.bookstoreApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ram.bookstoreApp.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
