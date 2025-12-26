import java.util.Scanner;

class BMIFitnessTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.println("Enter weight in kilograms:");
        double weight = sc.nextDouble();

        System.out.println("Enter height in meters:");
        double height = sc.nextDouble();

        // BMI calculation
        double bmi = weight / (height * height);

        // Display bmi value
        System.out.println("Your BMI is: " + bmi);

        // Display BMI category 
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

        sc.close();
    }
}
