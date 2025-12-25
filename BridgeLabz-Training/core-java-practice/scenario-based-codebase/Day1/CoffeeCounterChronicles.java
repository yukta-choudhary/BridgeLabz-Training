import java.util.Scanner;

class CoffeeCounterChronicles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // GST percentage
        double gstRate = 0.05;

        while (true) {

            System.out.println("\nEnter coffee type (espresso / latte / cappuccino) or type 'exit' to stop:");
            String coffeeType = sc.nextLine().toLowerCase();

            // Exit condition
            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting Ravi's Café!");
                break;
            }

            double pricePerCup = 0;

            // Selecting price using switch
            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 100;
                    break;
                case "latte":
                    pricePerCup = 120;
                    break;
                case "cappuccino":
                    pricePerCup = 150;
                    break;
                default:
                    System.out.println("Invalid coffee type! Please try again.");
                    continue; 
            }

            System.out.println("Enter quantity:");
            int quantity = sc.nextInt();
            sc.nextLine();

            // Bill calculation
            double totalAmount = pricePerCup * quantity;
            double gstAmount = totalAmount * gstRate;
            double finalBill = totalAmount + gstAmount;

            // Output
            System.out.println("Total Amount: Rs." + totalAmount);
            System.out.println("GST (5%): Rs." + gstAmount);
            System.out.println("Final Bill: Rs." + finalBill);
        }

        sc.close();
    }
}
