package org.example;

import org.example.Entity.Book;
import org.example.Entity.DataBase;
import org.example.Entity.Library;
import org.example.Entity.Reader;
import org.example.Enum.Gender;
import org.example.Enum.Genre;
import org.example.Service.BookService;
import org.example.Service.LibraryService;
import org.example.Service.ReaderService;
import org.example.ServiceImpl.BookServiceImpl;
import org.example.ServiceImpl.LibraryServiceImpl;
import org.example.ServiceImpl.ReaderServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        DataBase dataBase = new DataBase();

        LibraryService libraryService = new LibraryServiceImpl();
        List<Library> libraries = new ArrayList<>(
                List.of(new Library(1L, "Центральная научная библиотека", "Касым Тыныстанов"),
                        new Library(2L, "Инновационный центр", "Тоголок Молдо"),
                        new Library(3L, "Городская библиотека", "Элдияра Керимова"),
                        new Library(4L, "Национальная Библиотека", "Восток 5"),
                        new Library(5L, "Библиотека №14", "Площадь Ало-Тоо"),
                        new Library(6L, "ШТАБ", "Чуй Алматинка")));

        BookService bookService = new BookServiceImpl(libraryService);
         List<Book> bookslist = new ArrayList<>(
                 List.of(new Book(1L,"отцы и дети","Иван Тургенев",Genre.DRAMA),
                 new Book(2L,"Не тупи","Джен Синсеро",Genre.BIOGRAPHY),
                 new Book(3L,"Сделка","Эль Кеннеди",Genre.HISTORY)));


        ReaderService readerService = new ReaderServiceImpl(dataBase);
        List<Reader>readerList = new ArrayList<>(
                List.of(new Reader(1L,"Ulan Kubanychbekov","Ulan@gmail.com","+996700435678", Gender.MALE),
                new Reader(2L,"Baktulan Nazirbek Uulu","Baktulan@gmail.com","+996501479242",Gender.MALE),
                new Reader(3L,"Munara Manasova","Munara@gmail.com","+996701342331",Gender.FEMALE),
                new Reader(4L,"Aizada Abdrazakova","Aizada@gmail.com","+996702789765",Gender.FEMALE)));


        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Меню:");
            System.out.println("1. Сохранить библиотеку");
            System.out.println("2. получить все библиотеки");
            System.out.println("3. Получить библиотеку по идентификатору");
            System.out.println("4. Обновить библиотеку");
            System.out.println("5. удалить библиотеку");

            System.out.println("6. сохранить книгу");
            System.out.println("7. получить все книги");
            System.out.println("8. получить книгу по идентификатору");
            System.out.println("9. удалить книгу");
            System.out.println("10. Очистить книги по идентификатору библиотеки");
            System.out.println("11. сохранить читателя");
            System.out.println("12. получить всех читателей");
            System.out.println("13. получить читателя по идентификатору");
            System.out.println("14. обновить Ридер");
            System.out.print("Введите свой выбор: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(libraryService.saveLibrary(libraries));
                case 2:
                    System.out.println(libraryService.getAllLibraries());
                case 3:
                    System.out.println(libraryService.getLibraryById(1L));
                case 4:
                    System.out.println(libraryService.updateLibrary(2L, new Library("Чынгыз Айтматова Библиотека ", "Советская")));
                case 5:
                    System.out.println(libraryService.deleteLibrary(3L));
System.out.println("=============================================================================================================================================================================");
                case 6:
                    System.out.println(bookService.saveBook(1L, new Book(1L, "Жамийла","Чынгыз Айтматов", Genre.HORROR)));
                case 7:
                    System.out.println(bookService.getAllBooks(1L));
                    System.out.println(libraryService.saveLibrary(libraries));
                    System.out.println(libraryService.getAllLibraries());
                 case 8:
                     System.out.println(bookService.getBookById(1L, 1L));
                case 9:
                    System.out.println(bookService.deleteBook(5L, 3L));
                case 10:
                    bookService.clearBooksByLibraryId(6L);
System.out.println("===============================================================================================================================================================================");
                case 11:
                    readerService.saveReader(new Reader(1L,"Januzak Anashov","Januzak@gmail.com","+996701678234",Gender.MALE));
              /*  case 12:
                    System.out.println(readerService.getAllReaders());*/
              /*  case 13:
                    System.out.println(readerService.getReaderById(1L));*/

                case 14:
                    System.out.println(readerService.updateReader(1L, new Reader(1L, "Aijamal Asangazieva", "Aijamal@gmail.com", "+996704567893", Gender.FEMALE)));


            }
        }


    }
        }


