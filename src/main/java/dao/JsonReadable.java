package dao;

import com.google.gson.stream.JsonReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * Created by Сергей on 24.04.2015.
 */
public interface JsonReadable {

    default JsonReader getJsonReader(Class clazz)  throws FileNotFoundException{
        return new JsonReader(new InputStreamReader(new FileInputStream(clazz.getName().toLowerCase().substring("model.".length()) + ".json")));
    };

}
