package com.irving.library.serviceimpl;

import com.irving.library.entity.BookStock;
import com.irving.library.repo.BookRepo;
import com.irving.library.service.BookService;
import com.irving.library.service.GangaBookService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("generalBookStore")
@Primary
public class BookServiceImpl implements BookService, GangaBookService {

    private BookRepo bookRepo;


    //Constructor injection
    public BookServiceImpl(BookRepo bookRepo){
        this.bookRepo=bookRepo;
    }

    public String upsertBook(BookStock bookStock){
        bookRepo.save(bookStock);
        return "Record inserted/updated";
    }

    public List<BookStock> getAllBooks(){
        return bookRepo.findAll();
    }

    public String deleteBook(Integer id) {
        bookRepo.deleteById(id);
        return "Record Deleted";
    }

    @Override
    public Optional<BookStock> getSingleBook(Integer BookId) {
            return bookRepo.findById(BookId);
    }

    @Override
    public String gangaHealthCheck() {
        return "Health is from Regular";
    }
}
