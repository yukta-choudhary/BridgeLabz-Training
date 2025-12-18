import java.util.Scanner;

public class TotalPrice {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Create variables
        float unitPrice;
        int quantity;
        System.out.print("Enter unit price (INR): ");
        unitPrice = input.nextFloat();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        // Calculate total price
        float totalPrice = unitPrice * quantity;

        // Display result
        System.out.println("The total purchase price is INR  " + totalPrice +" if the quantity " + quantity +" and unit price is INR " + unitPrice);

        // Close scanner
        input.close();
    }
}
