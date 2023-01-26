package com.irving.library.controller;

import com.irving.library.entity.BookStock;
import com.irving.library.serviceimpl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookControllers {

    @Autowired
    private BookServiceImpl bookServiceImpl;

    @GetMapping(value="/getAllBooks")
    public ResponseEntity<List<BookStock>> getBooks(){
        List<BookStock> books=bookServiceImpl.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping(value="/getBookById")
    public ResponseEntity<Optional<BookStock>> getSpecificBook(@RequestParam Integer Id){
        Optional<BookStock> bookDetails= bookServiceImpl.getSingleBook(Id);
        return new ResponseEntity<>(bookDetails, HttpStatus.OK);
    }
    @PostMapping(value="/addBook")
    public ResponseEntity<String> saveBook(@RequestBody  BookStock bookStock){
        String message = bookServiceImpl.upsertBook(bookStock);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @PutMapping(value="/updateBook")
    public ResponseEntity<String> updateBook(@RequestBody BookStock bookStock){
        String message = bookServiceImpl.upsertBook(bookStock);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @DeleteMapping(value="/deleteBook/{bookId}")
    public ResponseEntity<String> deleteBookFromStock(@PathVariable Integer bookId){
        String message = bookServiceImpl.deleteBook(bookId);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
