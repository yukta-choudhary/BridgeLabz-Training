/*
	168. Excel Sheet Column Title

	Given an integer columnNumber, return its corresponding column title
	as it appears in an Excel sheet.

	Examples:
	1 -> A
	28 -> AB
	701 -> ZY
*/

import java.util.Scanner;

public class ExcelSheetColumnTitle {

    // Method to convert number to Excel column title
    public static String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {

			// Adjust for A = 1
            columnNumber--;             
            int rem = columnNumber % 26; 
            char ch = (char) ('A' + rem);

			 // Add at beginning
            result.insert(0, ch);       
            columnNumber = columnNumber / 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter column number: ");
        int columnNumber = input.nextInt();

        // Display result
        System.out.println("Excel Column Title: " + convertToTitle(columnNumber));
    }
}
