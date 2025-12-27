import java.util.Scanner;
import java.util.ArrayList;

public class PascalsTriangleII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input row index
        System.out.print("Enter rowIndex: ");
        int rowIndex = sc.nextInt();
        
        ArrayList<Integer> row = new ArrayList<>();
        row.add(1); // First element is always 1
        
        for (int i = 1; i <= rowIndex; i++) {
            // Update row from end to start to avoid overwriting
            for (int j = row.size() - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); // Last element is always 1
        }
        
        System.out.println(row);
        sc.close();
    }
}
