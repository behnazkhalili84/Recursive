package recursive;

import java.util.Scanner;

public class Q3Sum {
    public static void main(String[] args) {
        System.out.println("Please enter a number for receiving Sum Of digits ");
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        System.out.println("Sum Of digits for your num is : " + sumOfDigits(number));
    }

    private static int sumOfDigits(int n) {

        // Base case: If the number is a single digit, return the number itself
        if (n < 10) {
            return n;
        } else {
            // Recursive case: Sum the last digit and call the function with the remaining digits
            return n % 10 + sumOfDigits(n / 10);


        }
    }
}
