package com.irving.library.stubtestdouble;

import java.util.List;

public class BookService {
    private BookRepo bookRepo;

    public BookService(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }

   public List<Book> getNewBooksWithAppliedDicount(int discountRate, int days){
        List<Book> newBooks = bookRepo.findNewBooks(days);

        for(Book book: newBooks){
            int price = book.getPrice();
            int newPrice= price- (discountRate * price/100);
            book.setPrice(newPrice);
        }
        return newBooks;
   }

}
