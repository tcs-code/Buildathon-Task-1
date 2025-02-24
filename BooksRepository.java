package com.bookstoremanagement.bookstoremanagement.Repository;

import com.bookstoremanagement.bookstoremanagement.Models.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Long> {
}
