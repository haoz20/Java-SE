package com.example.model;

public class Cat extends Animal {

    private String color;

    public Cat(String color, boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color = color;
    }

    @Override
    public String toString() {
        String objStr = "Cat color is: " + this.color;
        objStr += "\nCat is Vegetarian: " + this.isVegetarian();
        objStr += "\nCat eats: " + this.getEats();
        objStr += "\nCat legs: " + this.getNoOfLegs() + " legs.";
        return objStr;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
