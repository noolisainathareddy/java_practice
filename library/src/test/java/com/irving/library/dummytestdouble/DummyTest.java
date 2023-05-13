package com.irving.library.dummytestdouble;

import com.irving.library.dummytestdouble.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {

    @Test
    public void demoDummy(){
        BookRepo bookRepo=new FakeBookRepo();
        EmailService emailService=new DummyEmailService();
        BookService bookService=new BookService(bookRepo, emailService);
        bookService.saveRecord(new Book("124", "java", 24, LocalDate.now()));
        bookService.saveRecord(new Book("125", "Python", 14, LocalDate.now()));

        assertEquals(2, bookService.numOfBooks());
    }
}
