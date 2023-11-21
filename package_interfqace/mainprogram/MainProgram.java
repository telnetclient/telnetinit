package mainprogram;

import calculator.Calculator;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Choose operation: 1.Addition 2.Subtraction 3.Multiplication 4.Division: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + calculator.add(a, b));
                break;
            case 2:
                System.out.println("Result: " + calculator.subtract(a, b));
                break;
            case 3:
                System.out.println("Result: " + calculator.multiply(a, b));
                break;
            case 4:
                System.out.println("Result: " + calculator.divide(a, b));
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
