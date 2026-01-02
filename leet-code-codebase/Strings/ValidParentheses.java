// Question 20: Valid Parentheses
// Check if brackets (), {}, [] are valid and balanced.

import java.util.Scanner;
import java.util.Stack;

class ValidParentheses {

    static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        // traverse string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // handle closing brackets
            else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }

        // valid if stack empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println(isValid(s));

        sc.close();
    }
}
