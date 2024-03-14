/* this java program demonstrates the application
* of method overloading using both static and
* non-static methods
*/

public class MethodOverloading {

    //static methiod for the area of the circle
    public static double area (double radius) {
        return Math.PI * radius * radius;
    }

    // non-static method for the area of the rectangle
    public double area (double length, double width) {
        return length * width;
    }

    //static method for the volume of a rectangular prism
    public static double area (double length, double width, double height) {
        return length * width * height; 
    }

    public static void main (String[] args) {
        //creating an object for the MethodOverloading class
        MethodOverloading MethodOverload = new MethodOverloading();

        // calling the static method in calculating the area of a circle
        double areaCircle = area(3.6);
        System.out.println("\n The area of the circle is: " + areaCircle);

        //calling the non-static method in calculating the area of a rectangle 
        double areaRectangle = MethodOverload.area(4.3, 8.2);
        System.out.println("\n The area of the rectangle is: " + areaRectangle);

        // calling the static method for calculating the volume of a rectangular prism
        double volumeRectprism = area (3.5, 6.1, 2.8);
        System.out.println("\n The volume of the Rectangular Prism is: " + volumeRectprism + "\n");
    }
}
