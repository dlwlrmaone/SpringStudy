package com.dlwlrma.spring5.collectiontype;

import java.util.List;

public class Book {

    private List<String> books;

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public void out(){
        System.out.println(books);
    }
}
