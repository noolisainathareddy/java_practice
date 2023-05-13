package com.irving.library.faketestdouble;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakeTest {

    @Test
    public void testFake(){
        BookRepo bookRepo = new FakeBookRepo();
        BookService bookService=new BookService(bookRepo);
        bookService.saveRecord(new Book("124", "java", 24, LocalDate.now()));
        bookService.saveRecord(new Book("125", "Python", 14, LocalDate.now()));
        assertEquals(2, bookService.numOfBooks());
    }


}
