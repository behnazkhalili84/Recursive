package recursive;

import java.util.Scanner;

public class Q6Reverse {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter your string ");
        String input = kb.nextLine();

        System.out.println(reverseString(input));
    }

    public static String reverseString(String input) {
        char temp;
        if (input.length() <= 1) {
            return input;
        } else {
            return reverseString(input.substring(1)) + input.charAt(0);
        }
    }
}
