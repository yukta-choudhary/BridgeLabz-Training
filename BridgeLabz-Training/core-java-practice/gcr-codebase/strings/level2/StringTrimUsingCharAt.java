import java.util.Scanner;

class StringTrimUsingCharAt {

    // Method to find start and end index without spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[] { start, end };
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        // Find trim indexes
        int[] indexes = findTrimIndexes(text);

        // Create trimmed string using charAt()
        String trimmedText = createSubstring(text, indexes[0], indexes[1]);

        // Create trimmed string using trim()
        String builtInTrim = text.trim();

        // Compare both results
        boolean isSame = compareStrings(trimmedText, builtInTrim);

        // Display results
        System.out.println("Trimmed text (User-defined): \"" + trimmedText + "\"");
        System.out.println("Trimmed text (Built-in): \"" + builtInTrim + "\"");
        System.out.println("Are both results same? " + isSame);
    }
}
