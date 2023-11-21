import java.util.Scanner;

public class MatrixMultiplication {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the size of the matrices (e.g., 3 for a 3x3 matrix): ");
       int size = scanner.nextInt();

       int[][] firstMatrix = new int[size][size];
       int[][] secondMatrix = new int[size][size];

       System.out.println("Enter the elements of the first matrix: ");
       for (int i = 0; i < size; i++) {
           for (int j = 0; j < size; j++) {
               firstMatrix[i][j] = scanner.nextInt();
           }
       }

       System.out.println("Enter the elements of the second matrix: ");
       for (int i = 0; i < size; i++) {
           for (int j = 0; j < size; j++) {
               secondMatrix[i][j] = scanner.nextInt();
           }
       }

       int[][] resultMatrix = new int[size][size];
       for (int i = 0; i < size; i++) {
           for (int j = 0; j < size; j++) {
               for (int k = 0; k < size; k++) {
                  resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
               }
           }
       }

       System.out.println("The result of the multiplication is: ");
       for (int i = 0; i < size; i++) {
           for (int j = 0; j < size; j++) {
               System.out.print(resultMatrix[i][j] + " ");
           }
           System.out.println();
       }
   }
}
