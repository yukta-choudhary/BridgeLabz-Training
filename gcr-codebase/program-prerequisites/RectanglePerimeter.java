// Program to calculate the perimeter of a rectangle
import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter width of the rectangle: ");
        double width = sc.nextDouble();
        double perimeter = 2*(length + width);

        System.out.println("Perimeter: " + perimeter);
    }
}
