package com.ashokit.crudoperations.service;

import com.ashokit.crudoperations.entity.Book;
import java.util.List;

public interface BookService {
    public String upsertBook(Book book);
    public List<Book> getAllBooks();
    public String deleteBook(Integer bookId);
}
