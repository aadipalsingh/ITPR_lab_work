public class checkstring {
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            // Checking if the character is not a digit
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "123456";
        String input2 = "123a56";

        System.out.println(input1 + " is numeric? " + isNumeric(input1));
        System.out.println(input2 + " is numeric? " + isNumeric(input2));
    }
}