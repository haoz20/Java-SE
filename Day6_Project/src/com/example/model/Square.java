package com.example.model;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }



    @Override
    public double area(){
        double area = Math.pow(side,2);
        return area;
    }

    public void display(){
        System.out.println("Square side: "+ this.side);
        System.out.println("Square area: "+ this.area());
    }

}
