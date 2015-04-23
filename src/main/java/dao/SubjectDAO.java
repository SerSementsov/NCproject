package dao;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import inputhandler.UserInputHandler;
import model.Subject;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class SubjectDAO implements DAO, JsonReadable {

    @Override
    public void create() throws IOException {
        Subject subject = createSubject();
        Writer writer = new FileWriter("subject.json",true);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        gson.toJson(subject,writer);
        writer.close();
        System.out.println("Done! New Subject successfully created!");
    }

    @Override
    public Subject read(int id) throws FileNotFoundException {
        return null;
    }

    @Override
    public List<Subject> readAll() throws FileNotFoundException {
        Gson gson = new Gson();
        JsonParser jsonParser = new JsonParser();
        JsonReader jsonReader = new StudentDAO().getJsonReader(Subject.class);

        JsonArray subjectsArray = jsonParser.parse(jsonReader).getAsJsonArray();
        List subjects = new ArrayList<Subject>();

        for(JsonElement aSubject: subjectsArray){
            Subject newSubject = gson.fromJson(aSubject, Subject.class);
            subjects.add(aSubject);
        }

        return subjects;
    }

    @Override
    public void update(int id) {

    }

    @Override
    public void delete(int id) {

    }

    private Subject createSubject() {

        Subject subject = new Subject();

        String name = new UserInputHandler().getStringAnswer("Enter the name of subject:");
        subject.setSubjectName(name);

        return subject;

    }
}
