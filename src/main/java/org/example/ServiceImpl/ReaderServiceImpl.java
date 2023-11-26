package org.example.ServiceImpl;

import org.example.Entity.DataBase;
import org.example.Entity.Reader;
import org.example.Service.ReaderService;

import java.util.List;

public class ReaderServiceImpl implements ReaderService {
    private final DataBase dataBase;

    public ReaderServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void saveReader(Reader reader) {
    dataBase.getReaders().add(reader);
        System.out.println(reader);
        }


    @Override
    public List<Reader> getAllReaders() {
        return dataBase.getReaders();

    }

    @Override
    public Reader getReaderById(Long id) {
   Reader reader1 = null;
       for(Reader reader : dataBase.getReaders()){
           if(reader.getId()==id){
               reader1 = reader;
           }

       }
        return reader1;
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
    Reader reader1 = getReaderById(id);
    reader1.setFullName(reader.getFullName());
    reader1.setEmail(reader.getEmail());
    reader1.setPhoneNumber(reader.getPhoneNumber());
    reader1.setGender(reader.getGender());
        return reader;
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {

    }
}
