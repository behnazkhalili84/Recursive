package recursive;

import java.util.Scanner;

public class Q1Factorial {
    public static void main(String[] args) {
        System.out.println("Please enter a number for receiving factorial ");
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        System.out.println("factorial for your num is : " + factorial(number));

    }

    private static int factorial(int n) {
        if(n == 0 || n == 1 ){
            return 1;
        }else
            return n * factorial(n-1);
    }
}
