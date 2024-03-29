package Polymorphism;

// Polymorphism: Using method overriding

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        // Calling the draw method, which is overridden in each class
        shape1.draw();
        shape2.draw();
    }
}
