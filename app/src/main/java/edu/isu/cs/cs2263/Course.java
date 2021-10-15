package edu.isu.cs.cs2263;

import java.io.Serializable;

public class Course implements Serializable{

    private Integer number;
    private String subject;
    private String title;

    /**
     * 
     * @param number The number of the course. Ex: 1182
     * @param subject The subject of the course Ex: CS
     * @param title The name of the course Ex: Intro to Programming
     */
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

    /**
     * Concatenates all course information 
     */
    public String toString(){
        return subject + " " + number + " " + title; 
    }

    

    












}