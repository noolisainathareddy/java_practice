package com.irving.library.stubtestdouble;

import com.irving.library.stubtestdouble.BookRepo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookRepoStub implements BookRepo {

    @Override
    public List<Book> findNewBooks(int days){
        List<Book> newBooks= new ArrayList<>();
        Book book1= new Book("124", "java", 500, LocalDate.now());
        Book book2= new Book("125", "Python", 400, LocalDate.now());

        newBooks.add(book1);
        newBooks.add(book2);
        return newBooks;

    }

}
