public class NumberLiteralsDemo {
    public static void main(String[] args) {
        // Binary literal (prefix 0b or 0B)
        int binary = 0b10101010; 

        // Octal literal (prefix 0)
        int octal = 0153; 

        // Hexadecimal literal (prefix 0x or 0X)
        int hexadecimal = 0xAfafa; 

        System.out.println("Binary literal (0b1010): " + binary);
        System.out.println("Octal literal (012): " + octal);
        System.out.println("Hexadecimal literal (0xA): " + hexadecimal);
    }
}