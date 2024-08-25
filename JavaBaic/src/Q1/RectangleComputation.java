package Q1;


public class RectangleComputation {
    public static void main(String[] args) {
        double l = 2.2;
        double w = 9.5;
        System.out.println("The area of the rectangle is: " + getRectangleArea(l, w));

    }

    public static double getRectangleArea(double length, double width) {
        return length * width;
    }
}
