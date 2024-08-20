package Assignment_StudentMarkManagementSystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class mainapp {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Student[] studentsArr = new Student[100];

    public static Student getStudentInfo() throws IOException {

        System.out.print("Enter student name: ");
        String name = br.readLine();

        System.out.print("Enter student nickname: ");
        String nickname = br.readLine();

        System.out.println("Enter marks for 6 subjects(or less, deafults to 0): ");

        int[] marks = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            int mark = Integer.parseInt(br.readLine());
            marks[i] = mark;
        }

        System.out.print("Enter student address1: ");
        String address1 = br.readLine();

        System.out.print("Enter student address2: (or press Enter to skip) ");
        String address2 = br.readLine();


        Student student;
        if (address2.equals("")) {
            student = new Student(name, nickname, address1, marks);
        } else {
            student = new Student(name, nickname, address1, address2, marks);
        }
        return student;

    }

    public static void main(String[] args) throws IOException {
        String answer = "";
        do {
            System.out.println("\nEnter details for a new student: ");
            Student student = getStudentInfo();
            studentsArr[Student.getStudentCount()-1] = student;
            System.out.print("Do you want to enter another student? (yes/no): ");
            answer = br.readLine();
        } while (answer.equalsIgnoreCase("yes"));

        output();
    }

    public static void output(){
        System.out.println("\nAll students: ");
        for (int i = 0; i < Student.getStudentCount(); i++) {
            studentsArr[i].display();
        }

    }
}

