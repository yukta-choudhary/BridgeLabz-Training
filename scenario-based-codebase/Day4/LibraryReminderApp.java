/*
15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class LibraryReminderApp {

    // Function to calculate late days
    public static long calculateLateDays(LocalDate dueDate, LocalDate returnDate) {
        if (returnDate.isAfter(dueDate)) {
            return ChronoUnit.DAYS.between(dueDate, returnDate);
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String dueDateInput, returnDateInput;
        LocalDate dueDate, returnDate;
        long lateDays;
        long fine;

        // Date format: dd-MM-yyyy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Calculate fine for 5 books
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i);

            // Take due date
            System.out.print("Enter due date (dd-MM-yyyy): ");
            dueDateInput = input.next();
            dueDate = LocalDate.parse(dueDateInput, formatter);

            // Take return date
            System.out.print("Enter return date (dd-MM-yyyy): ");
            returnDateInput = input.next();
            returnDate = LocalDate.parse(returnDateInput, formatter);

            lateDays = calculateLateDays(dueDate, returnDate);

            // Display fine
            if (lateDays > 0) {
                fine = lateDays * 5;
                System.out.println("Returned late by " + lateDays + " days");
                System.out.println("Fine = Rs. " + fine);
            } else {
                System.out.println("Returned on time");
                System.out.println("Fine = Rs. 0");
            }
        }

        System.out.println("Thank you!");
        input.close();
    }
}
