package edu.isu.cs.cs2263;

import java.io.Serializable;

public class Course implements Serializable{

    Integer number;
    String subject;
    String title;

    public Course(Integer number, String subject, String title){
       this.number = number;
       this.subject = subject;
       this.title = title;
    }

    public void setNumber(Integer newNumber){
        this.number = newNumber;
    }

    public Integer getNumber(){
        return number;
    }

    public void setSubject(String newSubject){
        this.subject = newSubject;
    }

    public String getSubject(){
        return subject;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
        return subject + " " + number + " " + title; 
    }

    

    












}