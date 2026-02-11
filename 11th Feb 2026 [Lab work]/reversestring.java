import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        // Create a Scanner to take the user's input
        Scanner sc = new Scanner(System.in);
        //enter a string
        System.out.print("Enter a string: ");
        // take the entire line of input as a string
        String og = sc.nextLine();
        
        String rev = "";
        
        // Loop from the last character index down to 0
        for (int i = og.length() - 1; i >= 0; i--) {
            // add the current character to the rev string
            rev = rev + og.charAt(i);
        }
        
        System.out.println("Original: " + og);
        System.out.println("Reversed: " + rev);
        sc.close();
    }
}