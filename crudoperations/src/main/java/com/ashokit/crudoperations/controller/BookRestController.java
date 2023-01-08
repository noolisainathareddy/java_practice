package com.ashokit.crudoperations.controller;

import com.ashokit.crudoperations.entity.Book;
import com.ashokit.crudoperations.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookRestController {

    @Autowired
    private BookService bookService;


    @PostMapping("/book")
    public ResponseEntity<String> addBook(@RequestBody Book book){
        String msg=bookService.upsertBook(book);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @GetMapping("/allBooks")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> allBooks=bookService.getAllBooks();
        return new ResponseEntity<>(allBooks, HttpStatus.OK);
    }

    @PutMapping("/updateBook")
    public ResponseEntity<String> updateBook(@RequestBody Book book){
        String msg=bookService.upsertBook(book);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Integer bookId){
        String msg=bookService.deleteBook(bookId);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
