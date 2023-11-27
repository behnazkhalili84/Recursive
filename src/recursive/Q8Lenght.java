package recursive;

import java.util.Scanner;

public class Q8Lenght {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter your string");
        String input = kb.nextLine();

        System.out.println("The lenght of your string is : " + lenOfString(input));
    }
    public static int lenOfString(String input){
        if(input.length() == 0){
            return 0;
        }
        else return 1+lenOfString(input.substring(1));
    }
}
