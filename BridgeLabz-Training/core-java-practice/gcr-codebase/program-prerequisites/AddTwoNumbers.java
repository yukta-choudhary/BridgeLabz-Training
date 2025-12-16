// Program to add two numbers entered by the user
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = sc.nextInt();

        int sum = firstNum + secondNum;
        System.out.println("Sum = " + sum);
    }
}
