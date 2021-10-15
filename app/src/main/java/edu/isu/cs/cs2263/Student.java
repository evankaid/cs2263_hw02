package edu.isu.cs.cs2263;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {

    private String firstName;
    private String lastName;
    private List<Course> courseList;

    public Student(String firstName, String lastName, List<Course> courseList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseList = courseList;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCourse(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Course> getCourse() {
        return courseList;
    }

    public String toString() {
        String studentInfo = firstName + " " + lastName + " [" ;
        for (int i =0; i < courseList.size(); i++){
            studentInfo += courseList.get(i).toString();
            studentInfo += " , ";
        }
        studentInfo += "]";
        return studentInfo;
    }

}