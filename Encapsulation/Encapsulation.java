package Encapsulation;

// Encapsulation: Using private fields and public methods to control access to data

class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student = new Student("John", 20);

        // Accessing private fields through public methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        // Modifying private fields through public methods
        student.setName("Jane");
        student.setAge(21);

        // Displaying updated information
        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());
    }
}

