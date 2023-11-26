package org.example.Entity;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Library> libraries = new ArrayList<>();
    private List<Book> books1 = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();

    public List<Library> getLibraries() {
        return libraries;
    }

    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }

    public List<Book> getBooks1() {
        return books1;
    }

    public void setBooks1(List<Book> books1) {
        this.books1 = books1;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }
}