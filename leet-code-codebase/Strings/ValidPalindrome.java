// Question 125: Valid Palindrome
// Check if a string is palindrome after removing


import java.util.Scanner;

class ValidPalindrome {

    static boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        // two pointer approach
        while (left < right) {

            char c1 = s.charAt(left);
            char c2 = s.charAt(right);

            // skip non-alphanumeric
            if (!Character.isLetterOrDigit(c1)) {
                left++;
            } else if (!Character.isLetterOrDigit(c2)) {
                right--;
            } else {
                if (c1 != c2)
                    return false;
                left++;
                right--;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));

        sc.close();
    }
}
