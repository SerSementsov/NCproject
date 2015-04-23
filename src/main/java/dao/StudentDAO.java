package dao;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import inputhandler.UserInputHandler;
import model.Student;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class StudentDAO implements DAO, JsonReadable{

    private static int counter;

    public void create() throws IOException {
        Student student = createStudent();
        Writer writer = new FileWriter("student.json",true);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        gson.toJson(student,writer);
        writer.close();
        System.out.println("Done! Student successfully created!");
    }

    public Student read(int id) throws FileNotFoundException {
        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new FileReader("student.json"));
        Student student = gson.fromJson(br, Student.class);
        return student;
    }

    public List<Student> readAll() throws FileNotFoundException {
        Gson gson = new Gson();
        JsonParser jsonParser = new JsonParser();
        JsonReader jsonReader = new StudentDAO().getJsonReader(Student.class);

        JsonArray studentsArray = jsonParser.parse(jsonReader).getAsJsonArray();
        List students = new ArrayList<Student>();

        for(JsonElement aStudent: studentsArray){
            Student tempStudent = gson.fromJson(aStudent,Student.class);
            students.add(tempStudent);
        }
        return students;
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
