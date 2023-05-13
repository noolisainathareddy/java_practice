package com.irving.library.stubtestdouble;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StubTest {

    @Test
    public void demoStub(){
        BookRepo bookRepo = new BookRepoStub();
        BookService bookService = new BookService(bookRepo);

        List<Book> newBookWithAppliedDicount = bookService.getNewBooksWithAppliedDicount(10, 7);

        assertEquals(2, newBookWithAppliedDicount.size());
        assertEquals(450, newBookWithAppliedDicount.get(0).getPrice());
        assertEquals(360, newBookWithAppliedDicount.get(1).getPrice());

    }


}
