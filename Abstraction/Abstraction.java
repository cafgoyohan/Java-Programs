package Abstraction;

// Abstract class
abstract class Shape {
    // Abstract method
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Interface
interface Colorable {
    void fillColor();
}

// Concrete class implementing the abstract class and interface
class Circle extends Shape implements Colorable {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling color for the circle");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Creating an object of Circle
        Circle circle = new Circle();

        // Using methods from abstract class
        circle.draw();
        circle.display();

        // Using method from interface
        circle.fillColor();
    }
}
