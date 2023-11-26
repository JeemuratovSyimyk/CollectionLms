package org.example.ServiceImpl;

import org.example.Entity.Book;
import org.example.Entity.Library;
import org.example.Service.BookService;
import org.example.Service.LibraryService;

import java.util.List;

public class BookServiceImpl implements BookService {
    private final LibraryService libraryService;

    public BookServiceImpl(LibraryService libraryService) {
        this.libraryService = libraryService;
    }
    @Override
    public Book saveBook(Long libraryId, Book book) {
        Library library = libraryService.getLibraryById(libraryId);
        library.setBook(book);
        return book;
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        return libraryService.getLibraryById(libraryId).getBooks();
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
      Library library2 = libraryService.getLibraryById(libraryId);
      for (Book book : library2.getBooks()){
          if(book.getId()==bookId){
                                  return book;
          }
      }
        return null;
    }
    @Override
    public String deleteBook(Long libraryId, Long bookId) {
   for (Library l: libraryService.getAllLibraries()){
       for (Book b: getAllBooks(libraryId)){
           if(libraryId.equals(l.getId())){
               if(libraryId.equals(b.getId())){
                   l.getBooks().remove(b);
               }
           }
       }
   }
        return "успешно удалено";
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
     for (Library l: libraryService.getAllLibraries()){
      if(libraryId == l.getId()) {
          l.setBooks(null);
          System.out.println("успешно удалил все книги...");
      }
      }
    }
}
