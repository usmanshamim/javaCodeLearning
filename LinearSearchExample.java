import java.util.Scanner;
public class LinearSearchExample {
    // Method for linear search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // Input key to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        // Call linear search method
        int result = linearSearch(arr, key);
        // Display result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}