import java.util.Scanner;

public class CollinearPoints {

    // Method using slope formula
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // slope AB = (y2 - y1)/(x2 - x1)
        // slope BC = (y3 - y2)/(x3 - x2)
        // slope AC = (y3 - y1)/(x3 - x1)
        // To avoid division by zero, use cross multiplication
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method using area of triangle formula
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for 3 points
        System.out.print("Enter x1, y1: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.print("Enter x2, y2: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        System.out.print("Enter x3, y3: ");
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        // Check collinearity by slope
        if (areCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (Slope method).");
        } else {
            System.out.println("Points are not collinear (Slope method).");
        }

        // Check collinearity by area
        if (areCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (Area method).");
        } else {
            System.out.println("Points are not collinear (Area method).");
        }

        input.close();
    }
}
