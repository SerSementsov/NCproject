package program;

import com.google.gson.Gson;
import dao.DAO;
import dao.StudentDAO;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        DAO studentDAO = new StudentDAO();
        //studentDAO.create();
        Gson gson = new Gson();
        System.out.println(studentDAO.read(654587).toString());
    }
}
