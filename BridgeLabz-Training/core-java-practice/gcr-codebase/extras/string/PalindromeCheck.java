import java.util.*;

public class PalindromeCheck {


	// Mehtod to check plaindorme string
	public static boolean isPalindrome (String text) {
	
		int left = 0;
		int right = text.length() - 1;


		while (left < right) {
			if (text.charAt(left) != text.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}


	public static void main(String[] args) {
		
		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String text = input.nextLine();

		boolean result = isPalindrome(text);

		// Display result
		if (result) {
			System.out.print("String is palindrome");
		} else {
			System.out.print("String is not a palindrome");
		}

		input.close();
	}
}
