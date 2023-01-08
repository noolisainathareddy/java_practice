package com.ashokit.crudoperations.repository;

import com.ashokit.crudoperations.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
