import java.util.Scanner;
// Custom exception class for invalid dimensions
class invalidation extends Exception { 
    public invalidation(String message) {
        super(message);
    }
}
// Creating rectangle class to calculate area and perimeter
public class rectangle {
    private double length;
    private double width;

    public rectangle(double length, double width) throws invalidation {
        // A rectangle's length and width must be positive numbers
        if (length <= 0 || width <= 0) {
            // throw is used to create and signal the error
            throw new invalidation("length and width must be positive values.");
        }
        this.length = length;
        this.width = width;
    }

    //method to calculate the area of the rectangle
    public double area() {
        return length * width;
    }
    //method to calculate the perimeter of the rectangle
    public double perimeter() {
        return 2 * (length + width);
    }
   //Main method 
    public static void main(String[] args) {
        // rectangle class and exception handling using try and catch block
        try {
            rectangle rect = new rectangle(5, 10);
            System.out.println("Area: " + rect.area());
            System.out.println("Perimeter: " + rect.perimeter());

            rectangle invalidRect = new rectangle(-5, 10);
        } catch (invalidation e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}