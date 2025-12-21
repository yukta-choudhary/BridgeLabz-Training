import java.util.Scanner;

public class PointLine {

    // Method to calculate Euclidean distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to calculate slope and y-intercept of the line
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m = 0;
        double b = 0;

        if (x2 != x1) { // Avoid division by zero
            m = (y2 - y1) / (x2 - x1);
            b = y1 - m * x1;
        } else {
            System.out.println("Line is vertical. Slope is undefined.");
        }

        double[] equation = new double[2]; 
        equation[0] = m;
        equation[1] = b;

        return equation;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input coordinates of two points
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate and display distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the points: " + distance);

        // Calculate and display line equation
        double[] eq = lineEquation(x1, y1, x2, y2);
        if (x2 != x1) {
            System.out.println("Equation of the line: y = " + eq[0] + "x + " + eq[1]);
        }
    }
}
