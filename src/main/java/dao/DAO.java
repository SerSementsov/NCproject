package dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface DAO {
    void        create() throws IOException;
    <T> T       read(int id) throws FileNotFoundException;
    <T> List<T> readAll() throws FileNotFoundException;
    void        update(int id);
    void        delete(int id);
}
