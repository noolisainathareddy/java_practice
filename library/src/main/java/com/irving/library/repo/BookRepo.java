package com.irving.library.repo;

import com.irving.library.entity.BookStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<BookStock, Integer> {

}
