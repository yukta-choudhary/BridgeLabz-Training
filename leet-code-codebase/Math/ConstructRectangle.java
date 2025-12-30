/*
Construct the Rectangle

Given a rectangular web page’s area, find length L and width W such that:
1. L * W = area
2. L >= W
3. Difference between L and W is minimum

Return [L, W]

Example 1:
Input: area = 4
Output: [2, 2]

*/

import java.util.Scanner;

public class ConstructRectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take area from user
        System.out.print("Enter area: ");
        int area = input.nextInt();

        int length = 0;
        int width = 0;

        // Start from square root of area and go down
        for (int w = (int) Math.sqrt(area); w >= 1; w--) {

            // If width divides area completely
            if (area % w == 0) {
                width = w;
                length = area / w;
                break;
            }
        }

        // Output result
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);

        input.close();
    }
}
