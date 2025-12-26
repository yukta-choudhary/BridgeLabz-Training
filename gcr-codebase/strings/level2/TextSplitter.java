import java.util.Scanner;

class TextSplitter {

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

        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Create words array
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }

        // Last word
        words[wordCount - 1] = text.substring(start);

        return words;
    }

    // Method to compare two string arrays using charAt()
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (findLength(arr1[i]) != findLength(arr2[i])) {
                return false;
            }
            for (int j = 0; j < findLength(arr1[i]); j++) {
                if (arr1[i].charAt(j) != arr2[i].charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Split using user defined method
        String[] manualSplit = splitText(text);

        // Split using split() method
        String[] builtInSplit = text.split(" ");

        // Compare both results
        boolean result = compareArrays(manualSplit, builtInSplit);

        // Display result
        System.out.println("Are both split results same? " + result);
    }
}
