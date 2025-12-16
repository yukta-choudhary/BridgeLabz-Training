// Program to calculate the area of a circle
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        final double PI = 3.14;
        double area = PI*radius*radius;

        System.out.println("Area of the circle:" + area);
    }
}
