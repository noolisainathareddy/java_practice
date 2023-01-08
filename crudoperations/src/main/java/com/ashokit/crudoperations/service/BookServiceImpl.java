package com.ashokit.crudoperations.service;

import com.ashokit.crudoperations.entity.Book;
import com.ashokit.crudoperations.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    @Override
    public String upsertBook(Book book) {

        Integer status = book.getBookId();
        bookRepository.save(book);
        if(status == null){
            return "Record Inserted";
        }
        else {
            return "Record Updated";
        }
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public String deleteBook(Integer bookId) {

        bookRepository.deleteById(bookId);
        return "Book Deleted";
    }
}
