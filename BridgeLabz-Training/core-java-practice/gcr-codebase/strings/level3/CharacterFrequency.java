import java.util.Scanner;

class CharacterFrequency {

    // Method to find character frequencies and return 2D array
    public static String[][] findCharacterFrequency(String text) {

        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        // Count unique characters
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] > 0) {
                count++;
                frequency[text.charAt(i)] = -frequency[text.charAt(i)];
            }
        }

        String[][] result = new String[count][2];
        int index = 0;

        // Store characters and their frequencies
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] < 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(-frequency[ch]);
                frequency[ch] = 0;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Find character frequencies
        String[][] frequencyTable = findCharacterFrequency(text);

        // Display result
        System.out.println("\nCharacter Frequency");
        System.out.println("Character - Count");

        for (int i = 0; i < frequencyTable.length; i++) {
            System.out.println(frequencyTable[i][0] + " - " +frequencyTable[i][1]);
        }
    }
}
