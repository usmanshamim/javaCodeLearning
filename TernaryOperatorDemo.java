import java.util.Scanner;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept three integers from the user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Calculate sum, difference, product, and average
        int sum = a + b + c;
        int difference = a - b - c;
        int product = a * b * c;
        double average = sum / 3.0;

        // Find maximum using ternary operator
        ////////// (CONDITION)?{TRUE_PART}:{FALSE_PART}
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        // Find minimum using ternary operator
        ////////// (CONDITION)?{TRUE_PART}:{FALSE_PART}
        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);

        // Print results
        System.out.println("\nResults:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        sc.close();
    }
}