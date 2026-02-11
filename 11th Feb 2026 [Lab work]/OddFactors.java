import java.util.Scanner;

public class OddFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.print("Odd factors of " + number + " are: ");
        
        // Loop from 1 up to the number
        for (int i = 1; i <= number; i++) {
            // Check if 'i' is a factor AND if 'i' is odd
            if (number % i == 0 && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println(); // New line for cleaner output
        scanner.close();
    }
}