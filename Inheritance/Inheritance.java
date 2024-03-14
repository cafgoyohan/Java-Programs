package Inheritance;

// Inheritance: Creating a base class and a derived class

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        // Creating an object of the derived class (Dog)
        Dog myDog = new Dog();

        // Accessing methods from the base class (Animal)
        myDog.eat();

        // Accessing methods from the derived class (Dog)
        myDog.bark();
    }
}

