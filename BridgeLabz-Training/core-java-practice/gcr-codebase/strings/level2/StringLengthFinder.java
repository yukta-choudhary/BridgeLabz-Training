import java.util.Scanner;

class StringLengthFinder {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input using next()
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Call user defined method
        int manualLength = findLength(text);

        // Use length() method
        int builtInLength = text.length();

        // Display results
        System.out.println("Length using user-defined method: " + manualLength);
        System.out.println("Length using built-in length(): " + builtInLength);
    }
}
