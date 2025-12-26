import java.util.*;

public class RemoveDuplicate {
	
	// Method to remove duplicates from a string
	public static String removeDuplicate (String text) {
		boolean[] isVisited = new boolean[256];

		String result = "";
		
		for(int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);

			if(!isVisited[ch]) {
				isVisited[ch] = true;
				result = result + ch;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		
		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String text = input.nextLine();

		String output = removeDuplicate(text);

		// Display output
		System.out.println("String after removing duplicates is: " + output);

	}
}

	