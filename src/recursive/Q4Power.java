package recursive;

import java.util.Scanner;

public class Q4Power {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter a number  ");
        int number = kb.nextInt();

        System.out.println("Please enter  exponent ");
        int exponent = kb.nextInt();

        System.out.println("exponent of your number is : " + power(number,exponent));
    }
    public static int power(int m,int n){
        if(n == 0){
            return 1;
        }
        else return m * power(m,n-1);
    }
}
