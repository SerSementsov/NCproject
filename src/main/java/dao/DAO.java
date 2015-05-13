package dao;

import model.Entity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface DAO <T extends Entity>{
    String  create(T entity) throws IOException, SQLException;
    T       read(String id) throws FileNotFoundException, SQLException;
    List<T> readAll()        throws FileNotFoundException;
    void    update(T entity) throws IOException;
    void    delete(T entity) throws IOException;
    void    delete(String id) throws IOException;
}
