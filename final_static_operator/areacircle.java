import java.util.Scanner;

class areacircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int r = scanner.nextInt();
        final double pi = 3.14;

        double area = pi * r * r;
        System.out.print("Area:");
        System.out.println(String.format("%.2f", area));
    }
}
