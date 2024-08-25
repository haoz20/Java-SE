package Q4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CheckPassFail {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        System.out.print("Enter your mark: ");
        int mark = Integer.parseInt(br.readLine());

        if (mark >= 50) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

    }
}
