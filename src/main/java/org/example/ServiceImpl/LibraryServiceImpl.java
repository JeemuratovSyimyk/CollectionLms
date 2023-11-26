package org.example.ServiceImpl;

import org.example.Entity.DataBase;
import org.example.Entity.Library;
import org.example.Service.LibraryService;

import java.util.List;

public class LibraryServiceImpl implements LibraryService {
 private  DataBase dataBase = new DataBase();

    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
       dataBase.getLibraries().addAll(libraries);
        return libraries;
    }
    @Override
    public List<Library> getAllLibraries() {
        return dataBase.getLibraries();
    }

    @Override
    public Library getLibraryById(Long id) {
    Library library1 = null;
    for (Library library :dataBase.getLibraries()){
        if(library.getId()==id){
            library1 = library;
           }
       }
        return library1;
    }

    @Override
    public Library updateLibrary(Long id, Library newlibrary) {
        Library library = getLibraryById(id);
        library.setName(newlibrary.getName());
        library.setAddress(newlibrary.getAddress());
        library.setBooks(newlibrary.getBooks());
        return library;
    }

    @Override
    public String deleteLibrary(Long id) {
       dataBase.getLibraries().remove(getLibraryById(id));
        return String.format("Library  с идентификатором: %d удален",id);
    }
}
