import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Create variables for base and height
        float base, height;
        System.out.print("Enter base of the triangle (in inches): ");
        base = input.nextFloat();
        System.out.print("Enter height of the triangle (in inches): ");
        height = input.nextFloat();

        // Calculate area in square inches
		// 1 square inch = 6.45 square centimeters

        float areaInSqInches = 0.5f * base * height;
        // 1 square inch = 6.45 square centimeters
        float areaInSqCm = areaInSqInches * 6.45f;

        // Display result
        System.out.println("Area of the triangle in square inches is " + areaInSqInches +" and in square centimeters is " + areaInSqCm);

        // Close scanner
        input.close();
    }
}
