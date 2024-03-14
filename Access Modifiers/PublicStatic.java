import java.util.Scanner;

public class PublicStatic {

    // Public static variables to store the numbers
    public static int num1;
    public static int num2;

    // Public static method to add two numbers
    public static int add() {
        return num1 + num2;
    }

    // Public static method to subtract two numbers
    public static int subtract() {
        return num1 - num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        // Call the public static methods to perform addition and subtraction
        int sum = PublicStatic.add();
        int difference = PublicStatic.subtract();

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        scanner.close();
    }
}
