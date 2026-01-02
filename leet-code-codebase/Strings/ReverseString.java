/* Question 344: Reverse String
 Given a character array s,
 reverse the array in-place using O(1) extra space.
*/

import java.util.Scanner;

class ReverseString {

    // method to reverse character array
    static void reverse(char[] s) {

        int left = 0;
        int right = s.length - 1;

        // swap characters
        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        // convert string to char array
        char[] s = str.toCharArray();

        // reverse array
        reverse(s);

        // print reversed string
        System.out.println(new String(s));

        sc.close();
    }
}
