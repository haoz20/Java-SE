package com.example.model;

public class Dog extends Animal {
    private String type;

    public Dog(String type, boolean veg, String food, int legs){
        super(veg, food, legs);
        this.type = type;
    }

    @Override
    public String toString() {
        String objStr = "Dog type is: " + this.type;
        objStr += "\nDog is Vegetarian: " + this.isVegetarian();
        objStr += "\nDog eats: " + this.getEats();
        objStr += "\nDog legs: " + this.getNoOfLegs() + " legs.";
        return objStr;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof, woof");
    }
}
