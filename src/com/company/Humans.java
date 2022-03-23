package com.company;

public class Humans {
    private String dateOfBirth;
    private String name;

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails(String name, String DOB){
        this.name = name;
        this.dateOfBirth = DOB;
        System.out.println("Name :"+this.name);
        System.out.println("DOB :"+this.dateOfBirth);
    }
}
