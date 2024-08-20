package com.example.main;


import com.example.model.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.RecursiveAction;

public class ShapeTest {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Shape[] shapes = new Shape[300];

    public static Rectangle getRectangle() throws IOException {
        System.out.print("Enter Rectangle Length: ");
        double length = Double.parseDouble(br.readLine());
        System.out.print("Enter Rectangle Width: ");
        double width = Double.parseDouble(br.readLine());

        Rectangle rectangle = new Rectangle(length, width);
        return rectangle;
    }

    public static Square getSquare() throws IOException {
        System.out.print("Enter Square Side: ");
        double side = Double.parseDouble(br.readLine());
        Square square = new Square(side);
        return square;
    }

    public static Circle getCircle() throws IOException {
        System.out.print("Enter Circle Radius: ");
        double radius = Double.parseDouble(br.readLine());
        Circle circle = new Circle(radius);
        return circle;
    }

    public static void getShapesInfo() throws IOException {
        String flag;
        do {
            System.out.print("Enter Shape type (Rectangle, Square, Circle): ");
            String shape = br.readLine();

            if (shape.equalsIgnoreCase("rectangle")) {

                shapes[Shape.getCount() - 1] = getRectangle();

            } else if (shape.equalsIgnoreCase("circle")) {

                shapes[Shape.getCount() - 1] = getCircle();

            }else if (shape.equalsIgnoreCase("square")) {

                shapes[Shape.getCount() - 1] = getSquare();

            }
            System.out.print("Do you want to add new shape? (yes/no): ");
            flag = br.readLine();
        }while(flag.equalsIgnoreCase("yes"));
    }

    public static void main(String[] args) throws IOException {
        getShapesInfo();
        displayShapes();


    }

    public static void displayShapes(){
        displayRectangels();
        displaySquares();
        displayCircles();
    }

    private static void displaySquares() {
        System.out.println("******* Square Objects *******");
        for (int i = 0; i < Square.getCount(); i++) {
            shapes[i].display();
        }
    }

    private static void displayRectangels() {
        System.out.println("******* Rectangle Objects *******");
        for (int i = 0; i < Rectangle.getCount(); i++) {
            shapes[i].display();
        }
    }

    private static void displayCircles() {
        System.out.println("******* Circle Objects *******");
        for (int i = 0; i < Circle.getCount(); i++) {
            shapes[i].display();
        }
    }

}
