package com.cis.batch33.library.model;

import lombok.Data;

import java.util.List;

@Data
public class Book {
    private int bookId;
    private String authorName;
    private String title;
    private int yearPublished;
    private int quantity;
    private List<BookIsbnDTO> bookIsbns;
}