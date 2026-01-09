// Question: Assign cookies to children to maximize content children (LeetCode 455)

import java.util.Scanner;
import java.util.Arrays;

public class AssignCookies {

    // Method to find maximum content children
    static int findContentChildren(int[] g, int[] s) {

        // Sort greed factors and cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // child index
        int j = 0; // cookie index
        int count = 0;

        // Assign cookies
        while (i < g.length && j < s.length) {
            // If cookie can satisfy child
            if (s[j] >= g[i]) {
                count++; // child is content
                i++;     // move to next child
                j++;     // move to next cookie
            } else {
                j++;     // try bigger cookie
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input greed array
        System.out.print("Enter number of children: ");
        int n = sc.nextInt();
        int[] g = new int[n];
        System.out.println("Enter greed factors:");
        for (int i = 0; i < n; i++) {
            g[i] = sc.nextInt();
        }

        // Input cookies array
        System.out.print("Enter number of cookies: ");
        int m = sc.nextInt();
        int[] s = new int[m];
        System.out.println("Enter cookie sizes:");
        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
        }

        // Call method and print result
        int result = findContentChildren(g, s);
        System.out.println("Maximum content children: " + result);

        sc.close();
    }
}
