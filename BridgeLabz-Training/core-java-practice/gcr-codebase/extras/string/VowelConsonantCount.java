import java.util.*;


public class VowelConsonantCount {
	
	// Method to check vowel or consonant
	public static String checkChar(char ch) {
		
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			
			if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				
				return "vowel";
			} else {
				return "Consonant";
			}
		}
		return "Not a letter";
	}

	// Method to count vowel and consonant
	public static int[] countVowelAndConsonants (String text) {
		
		int vowel = 0;
		int consonant = 0;


		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			String result = checkChar(ch);

			if (result.equals("vowel")) {
				vowel++;
			} else {
				consonant++;
			}
		}
		
		return new int[] {vowel, consonant};

	}


	public static void main(String[] args) {
		
		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		String text = input.nextLine();


		int[] result = countVowelAndConsonants(text);

		// Display output
		System.out.println("\n Vowels Count : " + result[0]);
		System.out.println("\n Consonants Count : " + result[1]);

	}
}