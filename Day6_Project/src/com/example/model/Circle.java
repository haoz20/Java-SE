package com.example.model;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }

    public void display(){
        System.out.println("Circle radius: " + this.radius);
        System.out.println("Circle area: " + this.area());
    }

}
