package edu.isu.cs.cs2263;

import org.checkerframework.checker.index.qual.SubstringIndexBottom;

public class Course {

    Integer number;
    String subject;
    String title;

    public Course(){
       
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