// Program to calculate power of a number
import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        double base = sc.nextDouble();
        System.out.println("Enter exponent: ");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);

        System.out.println("Power is " + result);
    }
}
