import java.util.Scanner;

class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character using charAt()
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];
        // Count frequency 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Find first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }
        return '\0'; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Find first non-repeating character
        char result = findFirstNonRepeatingChar(text);

        // Display result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}
