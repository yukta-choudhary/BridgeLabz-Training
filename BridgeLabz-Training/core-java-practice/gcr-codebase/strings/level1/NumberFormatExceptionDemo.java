import java.util.Scanner;

class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number is: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input as String
        System.out.print("Enter a value: ");
        String text = sc.nextLine();

        // Call method to generate exception
        // generateException(text); 

        // Call method to handle the exception
        handleException(text);
    }
}
