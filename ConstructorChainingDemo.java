class Parent {
   Parent() {
       System.out.println("Parent class constructor");
   }
}
class Child extends Parent {
   Child() {
       this(10);
       System.out.println("Child class default constructor");
   }
   Child(int x) {
       super();
       System.out.println("Child class parameterized constructor with value: " + x);
   }
}
public class ConstructorChainingDemo {
   public static void main(String[] args) {
       new Child();
   }}
