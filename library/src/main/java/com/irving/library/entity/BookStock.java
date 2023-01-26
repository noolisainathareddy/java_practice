package com.irving.library.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Table(name="Book_Stock")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookStock {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Book_Id")
    private Integer bookId;

    @Column(name="Book_Name", nullable = false)
    private String bookName;

    @Column(name="Author_Name", nullable = false)
    private String authorName;

    @Column(name="Book_Price", nullable = false)
    private Double bookPrice;

    @Column(name="Book_Version")
    private Double bookVersion;

    @CreationTimestamp
    @Column(name="Created_Date", updatable = false)
    private LocalDate createdDate;

    @UpdateTimestamp
    @Column(name="Updated_Date", insertable = false)
    private LocalDate updatedDate;
}
