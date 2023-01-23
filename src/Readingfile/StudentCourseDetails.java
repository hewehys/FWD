package Readingfile;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import static sun.security.util.Resources_zh_CN.contents;

public class StudentCourseDetails {
    public static void main(String[] S) throws FileNotFoundException {

        try {
            FileReader contents = new FileReader("C:\\Users\\Hewehy\\IdeaProjects\\LearningManagementSystem\\Student course details.json")
            JSONObject jsonObject = new JSONObject(contents);
            Iterator<String> keys = jsonObject.keys();

            while (keys.hasNext()) {
                String key = keys.next();
                if (jsonObject.get(key) instanceof JSONObject) {
                    // do something with jsonObject here

                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}