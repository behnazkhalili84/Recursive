package recursive;

import java.util.Scanner;

public class Q5Palindrome {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter your string ");
        String input = kb.nextLine();
        if(isPalindrome(input)){
            System.out.println("Your string is palindrome");
        }
        else {
            System.out.println("Your string is not palindrome");
        }
    }

    public static boolean isPalindrome(String input){
        if(input.length() == 0 || input.length() == 1){
            return true;
        }
        else {
            if(input.charAt(0) == input.charAt(input.length()-1)){
              return  isPalindrome(input.substring(1,input.length()-1));
            }
            else return false;
        }
    }
}
