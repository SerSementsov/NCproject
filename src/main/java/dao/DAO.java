package dao;

import java.io.IOException;
import java.util.List;

public interface DAO {
    void        create() throws IOException;
    <T> T       read(int id);
    <T> List<T> readAll();
    void        update(int id);
    void        delete(int id);
}
