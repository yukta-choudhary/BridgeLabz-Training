/*
	709. To Lower Case

	Problem:
	Given a string s, return the string after replacing every
	uppercase letter with the same lowercase letter.

	Example 1:
	Input: s = "Hello"
	Output: "hello"


*/

import java.util.Scanner;

public class ToLowerCase {

    // Method to convert string to lowercase
    public static String toLowerCase(String s) {

        char[] arr = s.toCharArray();

        // Convert each character
        for (int i = 0; i < arr.length; i++) {

            // Check if uppercase letter
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32);
            }
        }

        return new String(arr);
    }

    // Main method to take input
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        String result = toLowerCase(s);

        System.out.println("Output: " + result);

        sc.close();
    }
}
