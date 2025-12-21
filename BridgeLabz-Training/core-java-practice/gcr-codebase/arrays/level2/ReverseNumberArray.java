import java.util.Scanner;

public class ReverseNumberArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        // Count digits
        while (temp > 0)
        {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        temp = number;

        // Store digits in array
        for (int i = count - 1; i >= 0; i--)
        {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        int[] reverseArray = new int[count];

        // Reverse the array
        for (int i = 0; i < count; i++)
        {
            reverseArray[i] = digits[count - 1 - i];
        }

        System.out.println("Reversed number is:");
        for (int i = 0; i < count; i++)
        {
            System.out.print(reverseArray[i]);
        }

        input.close();
    }
}
