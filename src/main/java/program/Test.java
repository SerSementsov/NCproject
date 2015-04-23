package program;

import dao.DAO;
import dao.StudentDAO;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        DAO studentDAO = new StudentDAO();
        studentDAO.create();


    }
}
