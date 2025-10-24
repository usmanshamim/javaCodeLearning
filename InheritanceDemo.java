// Single-level inheritance example
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}
class Dog extends Animal { // Single-level inheritance
    void bark() {
        System.out.println("Dog barks.");
    }
}
// Multilevel inheritance example
class Puppy extends Dog { // Multilevel inheritance
    void weep() {
        System.out.println("Puppy weeps.");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("Single-level Inheritance:");
        Dog dog = new Dog();
        dog.eat();  // inherited from Animal
        dog.bark(); // Dog's own method
        System.out.println("\nMultilevel Inheritance:");
        Puppy puppy = new Puppy();
        puppy.eat();  // inherited from Animal
        puppy.bark(); // inherited from Dog
        puppy.weep(); // Puppy’s own method
    }
}
