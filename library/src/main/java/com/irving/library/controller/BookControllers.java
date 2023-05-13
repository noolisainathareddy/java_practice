package com.irving.library.controller;

import com.irving.library.entity.BookStock;
import com.irving.library.exception.BusinessException;
import com.irving.library.service.BookService;
import com.irving.library.service.GangaBookService;
import com.irving.library.serviceimpl.BookServiceImpl;
import com.irving.library.serviceimpl.GangaBookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookControllers {

    @Autowired
    private BookService bookService;

    @Autowired
    @Qualifier("gangaBookStore")
    private GangaBookService gangaBookService;

    @GetMapping(value="/healthcheck")
    public ResponseEntity<String> healthCheck(){
        String msg="Library app is up and running";
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @GetMapping("/gangaBookHealth")
    public ResponseEntity<String> getGangaBookHealth(){
        String msg= gangaBookService.gangaHealthCheck();
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @GetMapping(value="/getAllBooks",
            produces={"application/xml","application/json"}
    )
    public ResponseEntity<List<BookStock>> getBooks(){
        List<BookStock> books=bookService.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping(value="/getBookById")
    public ResponseEntity<Optional<BookStock>> getSpecificBook(@RequestParam Integer Id){
        Optional<BookStock> bookDetails= bookService.getSingleBook(Id);
        return new ResponseEntity<>(bookDetails, HttpStatus.OK);
    }
    @PostMapping(value="/addBook",
            consumes = {"application/xml", "application/json"}
    )
    public ResponseEntity<String> saveBook(@RequestBody  BookStock bookStock){
        try{
            if(bookStock.getBookName().isEmpty()){
                    throw new BusinessException("601", "Book name not found");
            }

            String message = bookService.upsertBook(bookStock);
            return new ResponseEntity<>(message, HttpStatus.CREATED);
        }
        catch(Exception e){
            throw new BusinessException("603", "something went wrong" + e.getMessage());
        }
    }

    @PutMapping(value="/updateBook")
    public ResponseEntity<String> updateBook(@RequestBody BookStock bookStock){
        String message = bookService.upsertBook(bookStock);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @DeleteMapping(value="/deleteBook/{bookId}")
    public ResponseEntity<String> deleteBookFromStock(@PathVariable Integer bookId){
        String message = bookService.deleteBook(bookId);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
