package com.ashokit.crudoperations.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="BOOK_INFO")
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="BOOK_IO")
    private Integer bookId;

    @Column(name="BOOK_NAME")
    private String bookName;

    @Column(name="BOOK_PRICE")
    private Double bookPrice;
}
