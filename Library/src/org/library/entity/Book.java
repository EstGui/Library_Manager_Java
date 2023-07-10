package org.library.entity;

public class Book {
    private String title, author, info, gen;
    private int numPags;
    private int id;
    private double value;

    public Book() {
    }

    public Book(String title, String author, String info, String gen, int numPags, double value, int id) {
        this.title = title;
        this.author = author;
        this.info = info;
        this.gen = gen;
        this.numPags = numPags;
        this.value = value;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }
    
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }
}
