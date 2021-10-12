package edu.isu.cs.cs2263;



public class Student {


    String firstName;
    String lastName;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args){


    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public String getFirstName(String firstName){
        return firstName;
    }

    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    public String getLastName(String lastName){
        return lastName;
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    

    












}