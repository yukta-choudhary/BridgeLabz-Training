import java.util.Scanner;

public class LeapYearCheckLogicalOp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year;
        System.out.print("Enter year: ");
        year = input.nextInt();

        if (year >= 1582 && ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))) {

            System.out.println("The year " + year + " is a leap year");
        } 
        else {
            System.out.println("The year " + year + " is not a leap year.");
        }

        input.close();
    }
}
