import java.util.Scanner;

class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input for array 
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[size];

        // Take user input for names
        System.out.println("Enter names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        // Call method to generate exception
        // generateException(names);  

        // Call method to handle the exception
        handleException(names);
    }
}
