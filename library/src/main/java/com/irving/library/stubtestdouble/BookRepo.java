package com.irving.library.stubtestdouble;

import java.util.Collection;
import java.util.List;


public interface BookRepo {
    List<Book> findNewBooks(int days);
}
