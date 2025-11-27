
// Program to calculate area and perimeter of a rectangle using Custom Exception
import java.util.Scanner;

// Custom Exception for invalid dimensions
class InvalidDimensionException extends Exception {
    public InvalidDimensionException(String message) {
        super(message);
    }
}

class Rectangle {
    private double length;
    private double width;

    // Constructor with validation
    public Rectangle(double length, double width) throws InvalidDimensionException {
        if (length <= 0 || width <= 0) {
            throw new InvalidDimensionException("Length and Width must be positive numbers!");
        }
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter length of rectangle: ");
            double length = sc.nextDouble();

            System.out.print("Enter width of rectangle: ");
            double width = sc.nextDouble();

            Rectangle rect = new Rectangle(length, width);
            System.out.println("Area of Rectangle: " + rect.calculateArea());
            System.out.println("Perimeter of Rectangle: " + rect.calculatePerimeter());
        } catch (InvalidDimensionException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}