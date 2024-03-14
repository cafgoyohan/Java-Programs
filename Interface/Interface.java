// Interface with abstract methods
interface MyInterface {
    void method1();
    void method2();
}

// Concrete class implementing the interface
class MyClass implements MyInterface {
    @Override
    public void method1() {
        System.out.println("Implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation of method2");
    }
}

public class Interface {
    public static void main(String[] args) {
        // Creating an object of the implementing class
        MyClass myObject = new MyClass();

        // Calling methods through the interface reference
        myObject.method1();
        myObject.method2();
    }
}
