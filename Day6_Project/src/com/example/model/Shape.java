package com.example.model;


public abstract class Shape {
    private static int count = 0;

    public Shape(){
        count++;
    }

    public static int getCount(){
        return count;
    }

    public abstract double area();

    public abstract void display();
}
