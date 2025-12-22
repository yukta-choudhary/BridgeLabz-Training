import java.util.Scanner;

class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        System.out.println(text.substring(2, 1));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(2, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled" + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled" + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call method to generate exception
        // generateException(text);  

        // Call method to handle the exception
        handleException(text);
    }
}
