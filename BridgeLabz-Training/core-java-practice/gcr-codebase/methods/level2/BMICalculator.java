import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and store in array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightMeter = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightMeter * heightMeter);
        }
    }

    // Method to find BMI status
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//create 2D array
        double[][] data = new double[10][3];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = input.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = input.nextDouble();
        }
		
        calculateBMI(data);
		
        String[] status = getBMIStatus(data);
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2] + "\t" + status[i]);
        }
        input.close();
    }
}
