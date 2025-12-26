import java.util.Scanner;

public class LeapYearCheck {

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        if (year >= 1582 &&
           ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        if (year < 1582) {
            System.out.println("Leap year check valid only for year >= 1582");
        } else {
            if (isLeapYear(year)) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }
        }
        input.close();
    }
}
