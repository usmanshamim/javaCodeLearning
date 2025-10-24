class Parent {
   void display() {
       System.out.println("Parent class display method");
   }
}
class Child extends Parent {
   @Override
   void display() {
       System.out.println("Child class overridden display method");
   }
   // Method Overloading
   void display(String msg) {
       System.out.println("Overloaded method: " + msg);
   }
}
public class OverloadingOveridingDemo {
   public static void main(String[] args) {
       Child obj = new Child();
       obj.display(); // Overridden method
       obj.display("Hello Java"); // Overloaded method
   }
}
