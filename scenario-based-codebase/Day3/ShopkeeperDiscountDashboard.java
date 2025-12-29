/* Shopkeeper’s Discount Dashboard 🛍️
	A shopkeeper gives discounts based on total bill:
	● Input item prices in a for-loop.
	● Use if-else for discount logic.
	● Use proper indentation, constants, and comments.
*/
import java.util.Scanner;

public class ShopkeeperDiscountDashboard {

    // Method to calculate final bill after discount
    public static double getBill(double totalAmount) {
        if (totalAmount >= 5000) {
            return totalAmount * 0.75;
        } else if (totalAmount >= 2000) {
            return totalAmount * 0.90;
        } else if (totalAmount >= 1000) {
            return totalAmount * 0.95;
        } else {
            return totalAmount;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of items
        System.out.println("Enter total number of items: ");
        int numberOfItems = input.nextInt();

        double itemPrice;
        double totalAmount = 0;
        double finalAmount = 0;

        // Loop until bill is generated
        while (numberOfItems>0) {

            System.out.println("Enter '+' to add prices or write 'Bill' to get the bill. Enter choice: ");
            String choice = input.next().toLowerCase();

            switch (choice) {

                case "+":
                    if (numberOfItems > 0) {
                        System.out.println("Enter price of item: ");
                        itemPrice = input.nextDouble();
                        totalAmount = totalAmount + itemPrice;
                        numberOfItems--;
                    } else {
                        System.out.println("All items already entered.");
                    }
                    break;

                case "bill":
                    finalAmount = getBill(totalAmount);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
			
			//Number of Items is zero then also generate bill
			if (numberOfItems == 0) {
				finalAmount = getBill(totalAmount);
				break;
			}

            // Exit loop after bill is generated
            if (choice.equals("bill")) {
                break;
            }
        }

        // Bill Summary
        System.out.println("\nBill Summary");
        System.out.println("----------------------------");
        System.out.println("Amount = " + totalAmount);
        System.out.println("Discount Price = " + (totalAmount - finalAmount));
        System.out.println("Total Price = " + finalAmount);

        input.close();
    }
}
