/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.isu.cs.cs2263;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.List;


public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Student Course Information");
        Label studentLabel = new Label("Students");
        Label courseLabel = new Label("Courses");
        Label isTaking = new Label("Is Taking");
        ListView<Student> studentList = new ListView<>();
        studentList.setPrefHeight(300);
        studentList.setPrefWidth(150);
        ListView<Course> courseList = new ListView<>();
        courseList.setPrefHeight((300));
        courseList.setPrefWidth((150));

        Button loadData = new Button("Load Data");
        loadData.setOnAction(value -> {
            IOManager iom = new IOManager();
            List<Student> listOfStudents = iom.readData("src\\main\\java\\edu\\isu\\cs\\cs2263\\StudentData.json");
          
        });

        VBox studentVBox = new VBox(studentLabel, studentList);

        VBox courseVBox = new VBox(courseLabel, courseList);
        HBox takingHBox = new HBox(isTaking);
        takingHBox.setPrefHeight(300);
        takingHBox.setPrefWidth(300);
        

        HBox hBox = new HBox(studentVBox, takingHBox, courseVBox, loadData);
        Scene scene = new Scene(hBox, 800, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);
       

    }

    // private static App singleton;

    // private App() {}

    // public static App instance(){
    // if (singleton == null){
    // singleton = new App();
    // }
    // return singleton;
    // }
}
