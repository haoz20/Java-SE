package com.example.model;

public class Animal {

    private boolean vegetarian;
    private String eats;
    private int noOfLegs;
    private static int count;

    public Animal(boolean veg, String food, int legs) {
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
        count++;
    }

    public static int getCount(){
        return count;
    }

    public boolean isVegetarian() {
        return this.vegetarian;
    }

    public void setVegetarian(boolean veg) {
        this.vegetarian = veg;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public String getEats() {
        return this.eats;
    }

    public void setNoOfLegs(int legs) {
        this.noOfLegs = legs;
    }

    public int getNoOfLegs() {
        return this.noOfLegs;
    }

    public void makeSound() {
        System.out.println("animal is making a sound");
    }

}
