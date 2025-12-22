import java.util.Scanner;

class WordLengthAnalyzer {

    // Method to find length of string without using length()
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

    // Method to split text into words using charAt()
    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = text.substring(start);
        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i]; // word
            table[i][1] = String.valueOf(findLength(words[i])); // length as string
        }
        return table;
    }

    // Method to find shortest and longest words
    public static String[] findShortestLongest(String[][] wordTable) {
        if (wordTable.length == 0) return new String[]{"", ""};
        String shortest = wordTable[0][0];
        String longest = wordTable[0][0];
        int minLength = Integer.parseInt(wordTable[0][1]);
        int maxLength = Integer.parseInt(wordTable[0][1]);
        for (int i = 1; i < wordTable.length; i++) {
            int len = Integer.parseInt(wordTable[i][1]);
            if (len < minLength) {
                minLength = len;
                shortest = wordTable[i][0];
            }
            if (len > maxLength) {
                maxLength = len;
                longest = wordTable[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Split text into words
        String[] words = splitText(text);

        // Create 2D array of word and length
        String[][] wordTable = createWordLengthTable(words);

        // Find shortest and longest words
        String[] result = findShortestLongest(wordTable);

        // Display result
        System.out.println("\nShortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
