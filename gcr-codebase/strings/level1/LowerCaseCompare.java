import java.util.Scanner;

class LowerCaseCompare {

    // Method to convert text to lowercase using charAt() and ASCII logic
    public static String convertToLowerCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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

        // Take complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Convert text using userdefined method
        String userLower = convertToLowerCase(text);

        // Convert text using toLowerCase() method
        String toLowerCaseLower = text.toLowerCase();

        // Compare both results
        boolean isSame = compareStrings(UserLower, toLowerCaseLower);

        // Display results
        System.out.println("Are both results same? " + isSame);
    }
}
