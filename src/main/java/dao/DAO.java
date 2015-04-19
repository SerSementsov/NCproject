package dao;

import java.util.List;

public interface DAO {
    void        create();
    <T> T       read(int id);
    <T> List<T> readAll();
    void        update(int id);
    void        delete(int id);
}
