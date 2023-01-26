package com.irving.library.service;

import com.irving.library.entity.BookStock;

import java.util.List;
import java.util.Optional;

public interface BookService {
    public String upsertBook(BookStock bookStock);
    public List<BookStock> getAllBooks();

    public String deleteBook(Integer BookId);

    public Optional<BookStock> getSingleBook(Integer BookId);
}
