import java.util.Scanner;

public class Charcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create an array of size 256 (standard ASCII size)
        int[] cou = new int[256];

        // Iterate over the string
        for (int i = 0; i < input.length(); i++) {
            // Use the ASCII value of the character as the index
            cou[input.charAt(i)]++;
        }

        System.out.println("Character counts:");
        for (int i = 0; i < 256; i++) {
            // Only print characters that appeared at least once
            if (cou[i] > 0) {
                System.out.println("'" + (char) i + "' : " + cou[i]);
            }
        }

        sc.close();
    }
}