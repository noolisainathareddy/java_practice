package com.irving.library.faketestdouble;

public class BookService {
    private BookRepo bookRepo;

    public BookService(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }

    public void saveRecord(Book book){
        bookRepo.save(book);
    }

    public int numOfBooks(){
        return bookRepo.findAll().size();
    }
}
