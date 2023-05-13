package com.irving.library.dummytestdouble;

public class BookService {
    private BookRepo bookRepo;
    private EmailService emailService;

    public BookService(BookRepo bookRepo, EmailService emailService){
        this.bookRepo = bookRepo;
        this.emailService =emailService;
    }

    public void saveRecord(Book book){
        bookRepo.save(book);
    }

    public int numOfBooks(){
        return bookRepo.findAll().size();
    }

    //other methods

}
