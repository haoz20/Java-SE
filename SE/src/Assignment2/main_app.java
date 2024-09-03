package Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main_app {
    static Animal[] animals = new Animal[10];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void inputData() throws IOException {
        System.out.print("Enter animal name: ");
        String name = br.readLine();

        System.out.print("Enter animal age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter animal species: ");
        String species = br.readLine();

        Animal animal = new Animal();
        animal.name = name;
        animal.age = age;
        animal.species = species;

        animals[Animal.totalNumber] = animal;
        Animal.totalNumber++;

    }


    public static void main(String[] args) throws IOException {
        String answer;
        do{
            inputData();

            System.out.print("Do you want to enter another animal? (yes/no): ");
            answer = br.readLine();

        }while (answer.equalsIgnoreCase("yes"));
        System.out.println("Total number of animals: " + Animal.totalNumber + "\n");
        for (int i = 0; i < Animal.totalNumber; i++) {
            System.out.println("Animal: " + (i+1));
            animals[i].displayInfo();
        }
    }
}
