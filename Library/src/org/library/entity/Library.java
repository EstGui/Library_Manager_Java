package org.library.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Library {
    private final String NAME = "Storyland";
    private final int CAPACITY = 20;
    private List<Book> books = new ArrayList<>();
    private Map<Integer, Client> clients = new TreeMap<>();

    public String getName() {
        return NAME;
    }
    
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public int getCapacity() {
        return CAPACITY;
    }

    public Map<Integer, Client> getClients() {
        return clients;
    }

    public void setClients(Map<Integer, Client> clients) {
        this.clients = clients;
    }
}
