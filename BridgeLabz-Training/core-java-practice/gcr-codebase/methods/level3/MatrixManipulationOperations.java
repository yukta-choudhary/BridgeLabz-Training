import java.util.Scanner;
import java.util.Random;

public class MatrixManipulationOperations {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to find the transpose
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Determinant of 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

    // Determinant of 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        int det = matrix[0][0]*(matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1])
                - matrix[0][1]*(matrix[1][0]*matrix[2][2]-matrix[1][2]*matrix[2][0])
                + matrix[0][2]*(matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0]);
        return det;
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Inverse not possible (determinant is 0)");
            return null;
        }
        double[][] inv = new double[2][2];
        inv[0][0] = matrix[1][1]/(double)det;
        inv[0][1] = -matrix[0][1]/(double)det;
        inv[1][0] = -matrix[1][0]/(double)det;
        inv[1][1] = matrix[0][0]/(double)det;
        return inv;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Inverse not possible (determinant is 0)");
            return null;
        }
        double[][] inv = new double[3][3];
        inv[0][0] =  (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1])/(double)det;
        inv[0][1] = -(matrix[0][1]*matrix[2][2] - matrix[0][2]*matrix[2][1])/(double)det;
        inv[0][2] =  (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1])/(double)det;
        inv[1][0] = -(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0])/(double)det;
        inv[1][1] =  (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0])/(double)det;
        inv[1][2] = -(matrix[0][0]*matrix[1][2] - matrix[0][2]*matrix[1][0])/(double)det;
        inv[2][0] =  (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0])/(double)det;
        inv[2][1] = -(matrix[0][0]*matrix[2][1] - matrix[0][1]*matrix[2][0])/(double)det;
        inv[2][2] =  (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0])/(double)det;
        return inv;
    }

    // Display double matrix
    public static void displayDoubleMatrix(double[][] matrix) {
        if (matrix == null) return;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //3x3 random matrix
        int[][] mat3x3 = createRandomMatrix(3, 3);
        System.out.println("Original 3x3 matrix:");
        displayMatrix(mat3x3);

        System.out.println("\nTranspose of 3x3 matrix:");
        displayMatrix(transposeMatrix(mat3x3));

        System.out.println("\nDeterminant of 3x3 matrix: " + determinant3x3(mat3x3));

        System.out.println("\nInverse of 3x3 matrix:");
        displayDoubleMatrix(inverse3x3(mat3x3));

        // 2x2 random matrix
        int[][] mat2x2 = createRandomMatrix(2, 2);
        System.out.println("\nOriginal 2x2 matrix:");
        displayMatrix(mat2x2);

        System.out.println("\nDeterminant of 2x2 matrix: " + determinant2x2(mat2x2));

        System.out.println("\nInverse of 2x2 matrix:");
        displayDoubleMatrix(inverse2x2(mat2x2));
    }
}
