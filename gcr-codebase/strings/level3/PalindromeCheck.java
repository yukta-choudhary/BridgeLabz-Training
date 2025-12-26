import java.util.Scanner;

class PalindromeCheck {

    // Logic1: Compare characters using start and end indexes (loop)
    public static boolean isPalindromeUsingLoop(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic2: Recursive palindrome check
    public static boolean isPalindromeUsingRecursion(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeUsingRecursion(text, start + 1, end - 1);
    }

    // Method to reverse string using charAt()
    public static char[] reverseText(String text) {
        char[] reverse = new char[text.length()];
        int j = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[j] = text.charAt(i);
            j++;
        }
        return reverse;
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeUsingArrays(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseText(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Logic 1
        boolean result1 = isPalindromeUsingLoop(text);

        // Logic 2
        boolean result2 = isPalindromeUsingRecursion(text, 0, text.length() - 1);

        // Logic 3
        boolean result3 = isPalindromeUsingArrays(text);

        // Display result
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Using Loop Method      : " + result1);
        System.out.println("Using Recursion Method : " + result2);
        System.out.println("Using Array Method     : " + result3);
    }
}
