import java.util.Scanner;

public class ReverseArrayOptimised {
    public static void reverseArray(int anyArray[]){
        int start = 0, end = anyArray.length-1;
        
        while(start < end){
            int temp = anyArray[start];
            anyArray[start]= anyArray[end];
            anyArray[end]=temp;                //swaping of numbers
            start++;
            end--;
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

        reverseArray(newArray);

        System.out.println("***********************");

         for(int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }
        sc.close();
    }
}
