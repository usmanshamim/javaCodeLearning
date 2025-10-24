interface Flyable {
   void fly();
}
interface Swimmable {
   void swim();
}
class Duck implements Flyable, Swimmable {
   public void fly() {
       System.out.println("Duck can fly.");
   }
   public void swim() {
       System.out.println("Duck can swim.");
   }
}
public class MultipleInheritanceDemo_Interfaces {
   public static void main(String[] args) {
       Duck duck = new Duck();
       duck.fly();
       duck.swim();}}
