package org.library.entity;

import java.util.List;
import java.util.LinkedList;

public class Shelves {
    private int qntBooks, id;
    private final int CAPACITY = 5;
    private String genre;
    private List<Book> books = new LinkedList<>();

    public Shelves(){
    }
    
    public int getQntBooks() {
        return qntBooks;
    }
    
    public void setQntBooks(int qntBooks) {
        this.qntBooks = qntBooks;
    }
    
    public int getCAPACITY() {
        return CAPACITY;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}