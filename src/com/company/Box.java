package com.company;

public class Box {
    private double height;
    private double width;
    private double length;

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void calculateArea(){
        double area = 2*(height*width+width*length+length*height);
        System.out.println("Area of this box is :" + area);
    }

    public void calculateVolume(){
        double volume = length*height*width;
        System.out.println("Volume of the box is :"+ volume);
    }

}
