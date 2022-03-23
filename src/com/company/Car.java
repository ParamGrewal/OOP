package com.company;

public class Car {
    private String make;
    private String model;
    private String year;
    private boolean isRunning;

    public Car(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startCar(){
        if (isRunning){
            System.out.println("its already Running");
        }
        else {
            this.isRunning = true;
            System.out.println("Your " + " " + year + " " + make + " " + model + " is running :" + isRunning);
        }

    }

    public void stopCar() {
        if (!isRunning) {
            System.out.println("Please start the car first");
        } else {
            this.isRunning = false;
            System.out.println("Your " + " " + year + " " + make + " " + model + " is running :" + isRunning);
        }
    }
}
