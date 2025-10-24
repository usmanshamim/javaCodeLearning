class InvalidAgeException extends Exception {
   public InvalidAgeException(String message) {
       super(message);
   }
}
public class ThrowDemo {
   static void checkAge(int age) throws InvalidAgeException {
       if (age < 18) {
           throw new InvalidAgeException("Age must be 18 or above.");
       }
       System.out.println("Valid age for voting.");
   }
   public static void main(String[] args) {
       try {
           checkAge(15);
       } catch (InvalidAgeException e) {
           System.out.println("Exception caught: " + e.getMessage());
       }
   }
}
