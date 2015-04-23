package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import inputhandler.UserInputHandler;
import model.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 * Created by Сергей on 19.04.2015.
 */
public class StudentDAO implements DAO{

    private static int counter;

    public void create() throws IOException {
        Student student = createStudent();
        Writer writer = new FileWriter("student" + ++counter + ".json");
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        gson.toJson(student,writer);
        writer.close();
        System.out.println("Done! Student successfully created!");
    }

    public <Student> Student read(int id) {

        return null;
    }

    public <Student> List<Student> readAll() {
        return null;
    }

    public void update(int id) {

    }

    public void delete(int id) {

    }
    private Student createStudent() {

        Student student = new Student();

        String firstName = new UserInputHandler().getStringAnswer("Enter student's first name: ");
        String lastName = new UserInputHandler().getStringAnswer("Enter student's last name: ");
        int rollId = new UserInputHandler().getIntAnswer("Enter student's roll number: ");

        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setRollNo(rollId);

        return student;
    }
}
