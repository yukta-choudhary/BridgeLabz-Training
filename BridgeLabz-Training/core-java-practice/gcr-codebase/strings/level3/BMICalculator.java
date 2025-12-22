import java.util.Scanner;

class BMICalculator {

    // Method to calculate BMI and status for one person
    public static String[] calculateBMI(double weight, double heightCm) {

        // Convert height from cm to meter
        double heightMeter = heightCm / 100;

        double bmiValue = weight / (heightMeter * heightMeter);
        bmiValue = Math.round(bmiValue * 100.0) / 100.0;

        String status;
        if (bmiValue <= 18.4) {
            status = "Underweight";
        } else if (bmiValue <= 24.9) {
            status = "Normal";
        } else if (bmiValue <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] { String.valueOf(bmiValue), status };
    }

    // Method to process BMI for all persons
    public static String[][] processBMI(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            String[] bmiResult = calculateBMI(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiResult[0];
            result[i][3] = bmiResult[1];
        }
        return result;
    }

    // Method to display BMI table
    public static void displayResult(String[][] result) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" +result[i][1] + "\t\t" +result[i][2] + "\t" +result[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Store weight and height
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] bmiResult = processBMI(data);

        // Display result
        displayResult(bmiResult);
		sc.close();
    }
}
