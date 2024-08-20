package com.example.main;


import com.example.model.*;

public class AnimalTest {
    static Animal[] animals = new Animal[100];

    public static void main(String[] args) {
        Cat cat1 = new Cat("White", true, "Milk", 4 );
        Cat cat2 = new Cat("Black", false, "Fish", 4 );
        Dog dog1 = new Dog("Bull", false, "Beef", 4);
        Dog dog2 = new Dog("Labrador", false, "Chicken", 4);

//        Animal animal = cat1; // upcasting
//        Cat c = (Cat) animal; // explict casting (Parent class ကနေ Child Class ကို ထည့်)

        animals[0] = cat1;
        animals[1] = dog1;
        animals[2] = cat2;
        animals[3] = dog2;

        for (int i = 0; i < Animal.getCount(); i++) {
            System.out.println(animals[i]);
            animals[i].makeSound();
            System.out.println("");
        }
    }

}
