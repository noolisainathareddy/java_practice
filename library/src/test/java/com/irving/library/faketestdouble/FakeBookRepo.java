package com.irving.library.faketestdouble;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepo implements BookRepo{

   Map<String, Book> bookStore = new HashMap<>();

    @Override
    public void save(Book book) {
        bookStore.put(book.getBookId(), book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookStore.values();
    }
}
