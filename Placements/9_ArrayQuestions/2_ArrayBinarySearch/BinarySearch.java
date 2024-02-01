import java.util.*;
public class BinarySearch{

    public static int linearSearch(int[] anyArray, int key){
        int start = 0, end = anyArray.length -1;

        while(start <= end){
            int mid = (start + end)/2;
            
            if(key == anyArray[mid]){
                return mid;
            }
            else if(key < anyArray[mid]){ //left condition
                end = mid-1;
            }
            else if(key > anyArray[mid]){ // right condition
                start = mid+1;
            }
        }
        return -1;
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

        System.out.print("Enter the number you want:");
        int key = sc.nextInt();

        int index = linearSearch(newArray, key);
        
        if(index == -1){
            System.out.println("NOT Found");
        }
        else{
            System.out.println("The number is at index: "+ index);
        }
        

        sc.close();
    }
}