public class TypeConversionDemo {
    public static void main(String[] args) {
        // Implicit type conversion (Widening)
        int intVal = 100;
        double doubleVal = intVal; // int to double
        System.out.println("Implicit Conversion:");
        System.out.println("int value: " + intVal);
        System.out.println("Converted to double: " + doubleVal);

        // Explicit type conversion (Narrowing)
        double originalDouble = 99.99;
        int convertedInt = (int) originalDouble; // double to int
        System.out.println("\nExplicit Conversion:");
        System.out.println("double value: " + originalDouble);
        System.out.println("Converted to int: " + convertedInt);

}
}