package edu.isu.cs.cs2263;

import java.util.List;

import com.google.gson.Gson;

public class IOManager extends App {

   


    // public List<Student> readData(){
        
    // }

     public List<Student> writeData(){
        Gson gson = new Gson();

        Student testStudent = new Student();
        String json = gson.toJson(testStudent);
     }
}
