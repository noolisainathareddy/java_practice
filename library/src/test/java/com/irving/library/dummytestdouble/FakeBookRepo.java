package com.irving.library.dummytestdouble;



import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepo implements BookRepo {

   Map<String, com.irving.library.dummytestdouble.Book> bookStore = new HashMap<>();

    @Override
    public void save(com.irving.library.dummytestdouble.Book book) {
        bookStore.put(book.getBookId(), book);
    }


    @Override
    public Collection<Book> findAll() {
        return bookStore.values();
    }
}
