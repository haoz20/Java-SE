package com.example.model;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        double area = this.length * this.width;
        return area;
    }

    public void display(){
        System.out.println("Length : " + this.length);
        System.out.println("Width : " + this.width);
        System.out.println("Area : " + this.area());
    }
}
