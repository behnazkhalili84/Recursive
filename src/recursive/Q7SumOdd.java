package recursive;

import java.util.Scanner;

public class Q7SumOdd {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter number of element in your array");

        int len = kb.nextInt();
        int[] myArray = new int[len];
        System.out.println("Please enter your elements");

        for (int i = 0 ; i < myArray.length ; i++){
            myArray[i] = kb.nextInt();
        }
        System.out.println("Sum of odd elements in your array is : " + sumOddArray(myArray,0));
    }
    public static int sumOddArray(int[] myArray , int index){
        int sum = 0;
        if(myArray.length == index){
           return 0;
           }
       sum = sumOddArray(myArray,index+1);
        if(myArray[index] % 2 == 1 ){
            sum += myArray[index];
        }
        return sum;
    }
}
