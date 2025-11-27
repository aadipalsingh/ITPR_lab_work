
import java.util.Scanner;

/*--- Defining a circle class ----*/
class Circle {
    float radius;// member variable to store radius of the circle

    // Constructor
    Circle() {
        // Creating object of the Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle(in cm) : ");
        radius = sc.nextFloat(); // Reading user input
        sc.close(); // closing scanner object to avoid resource leak
    }

    // method for calculating perimeter
    public void calculatePerimeter() {
        float perimeter = 2 * 3.14f * radius;
        System.out.println("Perimeter : " + perimeter + " cm");
    }

    // method for calculating area
    public void calculateArea() {
        float area = 3.14f * radius * radius;
        System.out.println("Area : " + area + " sq.cm");
    }

    // method to display data
    public void displayData() {
        System.out.println("-------------------------------");
        System.out.println("---- Circle ----");
        System.out.println("Radius : " + radius + " cm");
    }
}

/*------------------------------------*/
public class CircleOperation {

    public static void main(String[] args) {
        // Creating object of Circle
        Circle c1 = new Circle();
        // Displaying data
        c1.displayData();
        // calculating perimeter
        c1.calculatePerimeter();
        // calculating area
        c1.calculateArea();
    }

}
