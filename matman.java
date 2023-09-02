import java.util.Scanner;

public class matman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the matrix elements
        int[][] matrix = new int[3][3];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Perform matrix manipulation operations
        int[][] transpose = transposeMatrix(matrix);
        int[][] sum = addMatrix(matrix, matrix);
        int[][] difference = subtractMatrix(matrix, matrix);
        int[][] product = multiplyMatrix(matrix, matrix);
        int diagonalSum = sumOfDiagonalElements(matrix);

        // Display the results
        System.out.println("Transpose of the matrix:");
        displayMatrix(transpose);
        System.out.println("Sum of the matrix:");
        displayMatrix(sum);
        System.out.println("Difference of the matrix:");
        displayMatrix(difference);
        System.out.println("Product of the matrix:");
        displayMatrix(product);
        System.out.println("Sum of diagonal elements of the first matrix: " + diagonalSum);
    }

    // Method to calculate the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transpose = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to add two matrices
    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] difference = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return difference;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] product = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }

    // Method to calculate the sum of diagonal elements of a matrix
    public static int sumOfDiagonalElements(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
