/*
LeetCode 682: Baseball Game
Maintain scores using operations: +, D, C, or number
Return total score
*/

import java.util.Scanner;
import java.util.Stack;

public class BaseballGame
{
    // Method to calculate score
    static int calPoints(String[] ops)
    {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops)
        {
            if (op.equals("C"))
            {
                // Remove last score
                stack.pop();
            }
            else if (op.equals("D"))
            {
                // Double last score
                stack.push(stack.peek() * 2);
            }
            else if (op.equals("+"))
            {
                // Sum of last two scores
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            }
            else
            {
                // Add new score
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        // Sum all scores
        for (int x : stack)
            sum += x;

        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of operations:");
        int n = sc.nextInt();
        sc.nextLine();

        String[] ops = new String[n];

        System.out.println("Enter operations:");
        for (int i = 0; i < n; i++)
            ops[i] = sc.nextLine();

        int result = calPoints(ops);

        System.out.println("Total Score: " + result);

        sc.close();
    }
}
