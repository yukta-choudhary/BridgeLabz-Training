// Program to calculate the average of three numbers
import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNum = sc.nextDouble();

        System.out.println("Enter second number: ");
        double secondNum = sc.nextDouble();

        System.out.println("Enter third number: ");
        double thirdNum = sc.nextDouble();

        // Calculate average
        double average = (firstNum + secondNum + thirdNum) / 3;
        System.out.println("Average: " + average);
    }
}
