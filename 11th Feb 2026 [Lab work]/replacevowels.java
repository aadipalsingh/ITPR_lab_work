import java.util.Scanner;

public class replacevowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Replace all vowels (a, e, i, o, u - both cases) with '@'
        // The regex "[AEIOUaeiou]" matches any single vowel.
        String result = str.replaceAll("[AEIOUaeiou]", "@");
        
        System.out.println("Original: " + str);
        System.out.println("After Replacement: " + result);
        sc.close();
    }
}