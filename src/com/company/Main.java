package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Humans object = new Humans();
////        object.setDateOfBirth("14111999");
////        object.setName("Param Grewal");
//          object.printDetails("ParamGrewal","14111999");

        Employee object = new Employee("Param","737505");
        Employee param = new Employee("Sukhpreet","Null");
        param.printNameID();
        object.printNameID();



    }
}
