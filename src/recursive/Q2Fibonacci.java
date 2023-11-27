package recursive;

import java.util.Scanner;

public class Q2Fibonacci {
    public static void main(String[] args) {
        System.out.println("Please enter a number for receiving fibonacci ");
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        System.out.println("fibonacci for your num is : " + fibonacci(number));

    }
    public static int fibonacci(int n){
        if(n == 0 || n == 1 ){
            return n;
        }else
            return fibonacci(n-1) + fibonacci(n-2);

    }
}
