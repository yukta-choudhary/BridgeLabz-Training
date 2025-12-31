/*
	71. Excel Sheet Column Number

	Given a string columnTitle that represents the column title
	as it appears in an Excel sheet, return its corresponding column number.

	Examples:
	A  -> 1
	AB -> 28
	ZY -> 701
*/

import java.util.Scanner;

public class ExcelSheetColumnNumber {

    // Method to convert column title to number
    public static int titleToNumber(String columnTitle) {

        int result = 0;

        // Loop through each character
        for (int i = 0; i < columnTitle.length(); i++) {

            // Get character
            char ch = columnTitle.charAt(i);

            // Convert character to number (A = 1, B = 2 ...)
            int value = ch - 'A' + 1;

            // Multiply previous result by 26 and add value
            result = result * 26 + value;
        }

        return result;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter Excel column title: ");
        String columnTitle = input.next();

        // Display result
        System.out.println("Excel Column Number: " + titleToNumber(columnTitle));
    }
}
