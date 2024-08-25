package Q5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckOddEven {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(br.readLine());

        if (number % 2 == 0) {
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
}
