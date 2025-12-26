import java.util.Scanner;

public class ZaraBonus {

    // Method to generate salary and years of service for 10 employees
    public static int[][] generateEmployeeData() {
        int[][] data = new int[10][2]; 
        for (int i = 0; i < 10; i++) {
            int salary = 10000 + (int)(Math.random() * 90000); 
            int years = 1 + (int)(Math.random() * 10); 
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalary(int[][] oldData) {
        double[][] newData = new double[10][2]; // 0 -> new salary, 1 -> bonus
        for (int i = 0; i < 10; i++) {
            int salary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = 0;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }

    // Method to display all data in tabular format and calculate sums
    public static void displayData(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp#\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
            int oldSalary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            System.out.println((i+1) + "\t" + oldSalary + "\t\t" + years + "\t" + (int)bonus + "\t" + (int)newSalary);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("Total\t" + (int)totalOldSalary + "\t\t\t" + (int)totalBonus + "\t" + (int)totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] updatedData = calculateNewSalary(employeeData); 
        displayData(employeeData, updatedData); 
    }
}
