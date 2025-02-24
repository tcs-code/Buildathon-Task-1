package com.bookstoremanagement.bookstoremanagement.Controller;

import com.bookstoremanagement.bookstoremanagement.Models.Books;
import com.bookstoremanagement.bookstoremanagement.Repository.BooksRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BookStoreAppController {
    @Autowired
    private BooksRepository booksRepository;

    @Transactional
    @PostMapping("/bookentry")
    public ResponseEntity<Map<String, String>> bookEntry(@RequestBody Books book){
        Books bookObj = booksRepository.save(book);
        Map<String, String> response = new HashMap<>();
        response.put("Book Entry", "Entry done");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/retrievebooksdetails")
    public ResponseEntity<List<Books>> booksList(){
        List<Books> books = booksRepository.findAll();
        return ResponseEntity.ok(books);
    }
}
