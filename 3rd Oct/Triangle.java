
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        float angle1, angle2, angle3;
        // create object of scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first angle : ");
        angle1 = sc.nextFloat();
        System.out.print("Enter second angle : ");
        angle2 = sc.nextFloat();
        System.out.print("Enter third angle : ");
        angle3 = sc.nextFloat();
        System.out.println("-------------------------------------");
        // Displaying angle
        System.out.println("First Angle : " + angle1);
        System.out.println("Second Angle : " + angle2);
        System.out.println("Third Angle : " + angle3);
        /*--- Verify Triangle formation */
        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && (angle1 + angle2 + angle3) == 180) {
            System.out.println("These angles form a triangle");
        } else {
            System.out.println("These angles do not form any triangle");
        }
    }

}
