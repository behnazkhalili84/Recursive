package recursive;

import java.util.Scanner;

public class Q9Product {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter number of element in your array");

        int len = kb.nextInt();
        int[] myArray = new int[len];
        System.out.println("Please enter your elements");

        for (int i = 0 ; i < myArray.length ; i++){
            myArray[i] = kb.nextInt();
        }
        System.out.println("product of all numbers in an array is : "+multiply(myArray,0));
    }
    public static int multiply(int[] array , int index){
        int multiply = 1;
        if(array.length == index){
            return 1;
        }else {
             multiply = array[index]* multiply(array,index+1);
        }
        return multiply;
    }
}
