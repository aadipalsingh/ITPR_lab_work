// Program to check voting eligibility using Custom Exception
import java.util.Scanner;

// Custom Exception for invalid age input
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 0 || age > 120)
                throw new InvalidAgeException("Age must be between 0 and 120.");

            if (age >= 18)
                System.out.println("You are eligible to vote.");
            else
                System.out.println("You are not eligible to vote.");
        } 
        catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}