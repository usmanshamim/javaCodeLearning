class Calculator {
   int add(int a, int b) {
       return a + b;
   }
   double add(double a, double b) {
       return a + b;
   }
   int add(int a, int b, int c) {
       return a + b + c;
   }
}
public class MethodOverloading_PolymorphismDemo {
   public static void main(String[] args) {
       Calculator calc = new Calculator();
       System.out.println("Sum of two ints: " + calc.add(10, 20));
       System.out.println("Sum of two doubles: " + calc.add(5.5, 4.5));
       System.out.println("Sum of three ints: " + calc.add(1, 2, 3));
   }
}




