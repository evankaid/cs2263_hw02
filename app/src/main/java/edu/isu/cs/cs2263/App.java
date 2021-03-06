/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.isu.cs.cs2263;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.io.IOException;
import java.util.List;

import javax.print.event.PrintJobListener;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Student Course Information");
        Label studentLabel = new Label("Student");
        Label courseLabel = new Label("Courses");
        Label isTaking = new Label("Is Taking");
        ListView<Student> studentList = new ListView<>();
        studentList.setPrefHeight(300);
        studentList.setPrefWidth(150);
        ListView<Course> courseList = new ListView<>();
        courseList.setPrefHeight((300));
        courseList.setPrefWidth((150));

        Button loadData = new Button("Load Data");
        Button writeData = new Button("Write Data");

        // On button click, load student data in and display to listview
        loadData.setOnAction(value -> {
            studentList.getItems().clear();
            IOManager iom = new IOManager();
            List<Student> listOfStudents = iom.readData("src\\main\\java\\edu\\isu\\cs\\cs2263\\StudentData.json");

            for (int i = 0; i < listOfStudents.size(); i++) {
                studentList.getItems().add(listOfStudents.get(i));
            }
        });

        writeData.setOnAction(value -> {
            IOManager iom = new IOManager();
            List<Student> listOfStudents = iom.readData("src\\main\\java\\edu\\isu\\cs\\cs2263\\StudentData.json");
            try {
                iom.writeData("src\\main\\java\\edu\\isu\\cs\\cs2263\\WrittenStudentData.json", listOfStudents);
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        studentList.setOnMouseClicked(value -> {
            courseList.getItems().clear();
            ObservableList<Student> selectedIndex = studentList.getSelectionModel().getSelectedItems();
            for (Student s : selectedIndex) {
                courseList.getItems().addAll(s.getCourse());
            }

        });

        VBox studentVBox = new VBox(studentLabel, studentList);

        VBox courseVBox = new VBox(courseLabel, courseList);
        HBox takingHBox = new HBox(isTaking);
        takingHBox.setPrefHeight(300);
        takingHBox.setPrefWidth(300);

        HBox hBox = new HBox(studentVBox, takingHBox, courseVBox, loadData, writeData);
        Scene scene = new Scene(hBox, 800, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);

    }

    // private static App singleton;

    // private App() {
    // }

    // public static App instance() {
    // if (singleton == null) {
    // singleton = new App();
    // }
    // return singleton;
    // }
}
