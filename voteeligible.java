import java.util.Scanner;
// Main class to check voting eligibility.

public class VotingCheck {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Voting Eligibility Checker ---");
        System.out.print("Please enter your age: ");

        try {
            // Read the integer value for age
            int age = scanner.nextInt();

            // Check for a logical impossibility (negative age)
            if (age < 0) {
                System.out.println("Invalid input. Age cannot be negative.");
            }
            // Check the voting rule
            else if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } 
            // All other cases (age is 0 to 17)
            else {
                System.out.println("You are not eligible to vote yet.");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a whole number.");
        } finally {
            // close the scanner
            scanner.close();
        }
    }
}