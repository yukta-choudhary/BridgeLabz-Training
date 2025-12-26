import java.util.Scanner;

public class Quadratic {

    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // calculate discriminant

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2}; 
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root}; 
        } else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for a, b, c
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        // Call method to find roots
        double[] roots = findRoots(a, b, c);

        // Display roots
        if (roots.length == 2) {
            System.out.println("Roots are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Root is: " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }
    }
}
