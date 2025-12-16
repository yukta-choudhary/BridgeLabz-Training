// Program to calculate the volume of a cylinder
import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.println("Enter height of the cylinder: ");
        double height = sc.nextDouble();
        final double PI = 3.14;
        double volume = PI * radius * radius * height;

        System.out.println("Volume of the cylinder: " + volume);
    }
}
