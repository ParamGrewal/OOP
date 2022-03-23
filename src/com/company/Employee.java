package com.company;

public class Employee {
    private String employeeName;
    private String employeeID;

    public Employee(String employeeName, String employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    public void printNameID(){
        System.out.println ("Name is " + employeeName + " Employee ID " + employeeID);
    }
}
