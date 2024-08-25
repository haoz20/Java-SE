package Q2;

public class CyclinderComputation {
    public static void main(String[] args) {
        double radius = 3.0;
        double height = 5.0;
        System.out.println("The surface area of the cylinder: " + surfaceArea(radius, height));
        System.out.println("The volume of the cylinder: " + volume(radius, height));


    }

    public static double surfaceArea(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }

    public static double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

}
