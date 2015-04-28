package dao;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import jsonutils.JsonCRUDHandlerForStudent;
import jsonutils.JsonReadable;
import model.Student;
import validation.Validator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentJsonDAO implements DAO<Student>, Validator<Student>{

    @Override
    public String create(Student entity) throws IOException {
        if(isValid(entity)) {
            new JsonCRUDHandlerForStudent().writeEntityToFile(entity);
            return entity.getId();
        }
        else
            throw new IllegalArgumentException("Student data is not valid!");
    }

    public Student read(int id) throws FileNotFoundException {

        List<Student> students = readAll();

        for(Student student: students){
            if(student.getRollNo() == id)
                return student;
        }
        return null;

    }

    public List<Student> readAll() throws FileNotFoundException {
        Gson gson = new Gson();
        JsonParser jsonParser = new JsonParser();
        JsonReader jsonReader = JsonReadable.getJsonReader(Student.class);

        JsonArray studentsArray = jsonParser.parse(jsonReader).getAsJsonArray();
        List<Student> students = new ArrayList<>();

        for(JsonElement aStudent: studentsArray){
            Student tempStudent = gson.fromJson(aStudent,Student.class);
            students.add(tempStudent);
        }
        return students;
    }

    @Override
    public void update(Student entity) {

    }

    public void delete(int id) {

    }

    @Override
    public void delete(Student entity) {

    }

    @Override
    public boolean isValid(Student entity) {
        return entity != null && !(entity.getFirstName() == null || entity.getLastName() == null || entity.getRollNo() == 0);
    }
}
