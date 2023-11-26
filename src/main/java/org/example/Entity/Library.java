package org.example.Entity;
import java.util.List;
   
 public class Library {
    private long id;
    private String name;
    private String address;
    private List<Book> books;
    private List<Reader> readers;

       public Library (String name,String address)  {
           this.name = name;
           this.address = address;
       }
            // Constructor
     public Library(long id, String name, String address, List<Book> books, List<Reader> readers) {
         this.id = id;
         this.name = name;
         this.address = address;
         this.books = books;
         this.readers = readers;
     }
         public Library (long id,String name,String address) {
         this.id = id;
         this.name = name;
         this.address = address;
         }
     // Getters
     public long getId() {
         return id;
     }

     public String getName() {
         return name;
     }

     public String getAddress() {
         return address;
     }

     public List<Book> getBooks() {
         return books;
     }

     public List<Reader> getReaders() {
         return readers;
     }

     // Setters
     public void setId(long id) {
         this.id = id;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setAddress(String address) {
         this.address = address;
     }

     public void setBooks(List<Book> books) {
         this.books = books;
     }

     public void setReaders(List<Reader> readers) {
         this.readers = readers;
     }

        @Override
           public String toString() {
               return "\nLibrary{" +
                       "id=" + id +
                       ", name='" + name + '\'' +
                       ", address='" + address + '\'' +
                       ", books=" + books +
                       ", readers=" + readers +
                       '}';
         

     }

     public void setBook(Book book) {
     }
 }
