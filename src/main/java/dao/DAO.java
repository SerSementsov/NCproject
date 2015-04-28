package dao;

import model.Entity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface DAO <T extends Entity>{
    String  create(T entity) throws IOException;
    T       read(int id) throws FileNotFoundException;
    List<T> readAll() throws FileNotFoundException;
    void    update(T entity);
    //how we can know id if it is uuid?
    void    delete(int id);
    void    delete(T entity);
}
