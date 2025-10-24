import java.util.Scanner;
public class FibonacciRecursive {
    
    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
   } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input: number of terms
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int terms = sc.nextInt();
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
}