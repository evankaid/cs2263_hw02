package edu.isu.cs.cs2263;

import java.util.List;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Scanner;
import com.google.gson.reflect.TypeToken;

public class IOManager implements Serializable {

    /**
     * 
     * @param fileName StudentData.json file
     * @return List of students with information read from StudentData.json file
     */
    public List<Student> readData(String fileName) {
        try {
            File jsonFile = new File(fileName);
            String jsonString = "";

            Scanner myReader = new Scanner(jsonFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                jsonString += data;
            }

            Gson gs = new Gson();
            Type studentListType = new TypeToken<List<Student>>() {
            }.getType();
            List<Student> obj = gs.fromJson(jsonString, studentListType);
            return obj;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    /**
     * 
     * @param writeStudentData New file to write student data to
     * @param studentList      Student list that was read in from the readData
     *                         method
     */
    public void writeData(String writeStudentData, List<Student> studentList) throws IOException {
        Gson gson = new Gson();
        Type studentListType = new TypeToken<List<Student>>() {
        }.getType();
        gson.toJson(studentList, studentListType);
        

    }
}
