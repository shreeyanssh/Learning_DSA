// here we can optimse the code by decreasing its space complexity and 
// by using just one array and swaping the values with the array.

import java.util.*;
public class ReverseArray{

    public static void reverseArray(int[] anyArray){

        int reversedArray[] = new int[anyArray.length];

        for(int i = 0; i < anyArray.length; i++){
            reversedArray[i] = anyArray[anyArray.length-i-1];
        }

        for(int j = 0; j < reversedArray.length; j++){
            System.out.println(reversedArray[j]);
        }
    }
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of Elements in array:");
        int numberOfElements = sc.nextInt();
        int newArray[] = new int[numberOfElements];

        System.out.print("Enter the elements for the Array:");
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = sc.nextInt();
        }

        System.out.println("*********************");

        reverseArray(newArray);


        sc.close();
    }
}