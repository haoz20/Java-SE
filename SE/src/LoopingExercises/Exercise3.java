package LoopingExercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int r = n*i;
            System.out.println(n + " * " + i + " = " + r);
        }
    }
}
