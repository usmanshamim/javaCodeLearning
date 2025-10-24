public class NumericDefaults {
    // Numeric data types as instance variables
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;

    public void printDefaults() {
        System.out.println("Default values of numeric data types:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
    }

    public static void main(String[] args) {
        NumericDefaults defaults = new NumericDefaults();
        defaults.printDefaults();
    }
}
