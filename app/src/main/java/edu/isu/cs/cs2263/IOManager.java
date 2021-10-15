package edu.isu.cs.cs2263;

import java.util.List;
import com.google.gson.Gson;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Scanner; // Import the Scanner class to read text files
import com.google.gson.reflect.TypeToken;

public class IOManager implements Serializable {

    public List<Student> readData(String fileName) {
        try{

            File jsonFile = new File(fileName);
            String jsonString = "";

            Scanner myReader = new Scanner(jsonFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                jsonString += data;
            }
            System.out.println(jsonString);

            Gson gs = new  Gson();
            Type studentListType = new TypeToken<List<Student>>(){}.getType();
            List<Student> obj = gs.fromJson(jsonString, studentListType);
            return obj;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public void writeData(File StudentData, List<Student> studentList) {
        Gson gson = new Gson();

        gson.toJson(studentList);

    }
}
