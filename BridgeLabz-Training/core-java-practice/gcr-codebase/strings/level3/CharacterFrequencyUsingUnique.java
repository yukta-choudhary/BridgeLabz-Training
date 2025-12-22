import java.util.Scanner;

class CharacterFrequencyUsingUnique {

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        // Create exact size array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    // Method to find frequency using unique characters
    public static String[][] findCharacterFrequency(String text) {

        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        char[] uniqueChars = findUniqueCharacters(text);

        String[][] result = new String[uniqueChars.length][2];

        // Store character and frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Find frequency using unique characters
        String[][] frequencyTable = findCharacterFrequency(text);

        // Display result
        System.out.println("\nCharacter Frequency");
        System.out.println("Character - Count");

        for (int i = 0; i < frequencyTable.length; i++) {
            System.out.println(frequencyTable[i][0] + " - " +
                               frequencyTable[i][1]);
        }
    }
}
