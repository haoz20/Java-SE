package LoopingExercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int r = 1;
        for (int i = 1; i < n; i++) {
            r = r * (i+1);
        }
        System.out.println(r);
    }
}