import java.util.Scanner;

public class SqrtX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        
        if (x == 0 || x == 1) {
            System.out.println("Square root is: " + x);
            return;
        }
        
        int start = 1, end = x, ans = 0;
        
        // Binary search for square root
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (mid <= x / mid) { 
                ans = mid;       
                start = mid + 1; 
            } else {
                end = mid - 1;  
            }
        }
        
        System.out.println("Square root is: " + ans);
        sc.close();
    }
}
