// Question 125: Valid Palindrome
// Given a string s, check if it is a palindrome after:

class ValidPalindrome {

    // method to check palindrome
    static boolean isPalindrome(String s) {

        // convert to lowercase
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        // two pointer approach
        while (left < right) {

            char c1 = s.charAt(left);
            char c2 = s.charAt(right);

            // skip non-alphanumeric from left
            if (!Character.isLetterOrDigit(c1)) {
                left++;
            }
            // skip non-alphanumeric from right
            else if (!Character.isLetterOrDigit(c2)) {
                right--;
            }
            // compare characters
            else {
                if (c1 != c2)
                    return false;

                left++;
                right--;
            }
        }

        // palindrome if all matched
        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        // print result
        System.out.println(isPalindrome(s));
    }
}
