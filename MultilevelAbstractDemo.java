abstract class Animal {
    abstract void eat();
}
abstract class Mammal extends Animal {
    abstract void walk();
}
class Dog extends Mammal {
    @Override
    void eat() {
        System.out.println("Dog eats meat.");
    }
    @Override
    void walk() {
        System.out.println("Dog walks on four legs.");
    }
}
public class MultilevelAbstractDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
    }
}