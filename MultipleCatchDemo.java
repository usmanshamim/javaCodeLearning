public class MultipleCatchDemo {
   public static void main(String[] args) {
       try {
           int[] arr = new int[3];
           arr[5] = 10; // ArrayIndexOutOfBoundsException
           int result = 10 / 0; // ArithmeticException
       } catch (ArithmeticException e) {
           System.out.println("Arithmetic Exception: " + e.getMessage());
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Array Index Exception: " + e.getMessage());
       } finally {
           System.out.println("Finally block executed.");
       }
       System.out.println("\nWithout finally:");
       try {
           String str = null;
           System.out.println(str.length()); // NullPointerException
       } catch (NullPointerException e) {
           System.out.println("Null Pointer Exception: " + e.getMessage());
       }}}




