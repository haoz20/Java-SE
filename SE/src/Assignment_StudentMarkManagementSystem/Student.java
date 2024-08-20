package Assignment_StudentMarkManagementSystem;


public class Student {
    private String name;
    private String nickName;
    private String address1;
    private String address2;
    private int[] marks;
    private static int studentCount;
    private static int allTotalMark;

    public Student(String name, String nickName, String address1, int[] marks) {
        this.name = name;
        this.nickName = nickName;
        this.address1 = address1;
        this.marks = marks;
        studentCount++;
        allTotalMark = this.totalMark();
    }

    public Student(String name, String nickName, String address1, String address2, int[] marks) {
        this.name = name;
        this.nickName = nickName;
        this.address1 = address1;
        this.address2 = address2;
        this.marks = marks;
        studentCount++;
        allTotalMark = this.totalMark();
    }


    public static int getStudentCount(){
        return studentCount;
    }

    private int totalMark() {
        int total = 0;
        for (int i = 0; i < this.marks.length; i++) {
            total += this.marks[i];
        }
        return total;
    }

    public static double getMeanMark(){
        double mean = allTotalMark / studentCount;
        return mean;
    }

    public double calculateGPA(){
        int total = this.totalMark();
        double GPA = total/6;
        return GPA;
    }

    public void display(){
        System.out.println("\nName: " + this.name);
        System.out.println("Nickname: " + this.nickName);
        System.out.print("Marks: ");
        for (int i = 0; i < this.marks.length; i++) {
            System.out.print(this.marks[i] + " ");
        }
        System.out.println("\nGPA: " + calculateGPA());
        System.out.println("Address1: " + this.address1);
        if (this.address2 != null) {
            System.out.println("Address2: " + this.address2);
        }else{
            System.out.println("Address2: not provided\n");
        }
    }
}
