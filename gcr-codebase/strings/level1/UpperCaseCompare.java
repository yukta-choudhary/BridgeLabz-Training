import java.util.Scanner;

class UpperCaseCompare {

    // Method to convert text to uppercase using charAt() and ASCII logic
    public static String convertToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result = result + ch;
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String text1, String text2) {

        if (text1.length() != text2.length()) {
            return false;
        }

        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Convert text using user defined method
        String userUpper = convertToUpperCase(text);

        // Convert text using toUpperCase() method
        String toUpperCaseUpper = text.toUpperCase();

        // Compare both results
        boolean isSame = compareStrings(userUpper, toUpperCaseUpper);

        // Display results
        System.out.println("Are both results same? " + isSame);
    }
}
