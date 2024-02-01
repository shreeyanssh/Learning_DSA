import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {
    public static void reverseArrayList(ArrayList<Integer> list){
        for(int i = 0; i < list.size()/2; i++){
           
            int size = list.size();
            
            //swap
            int temp = list.get(i);
            list.set(i, list.get(size-i-1));
            list.set(size-i-1, temp);
        }
    }

    public static void printArrayList(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        //Getting Numbers
        System.out.print("Give any 5 Numbers: ");
        for(int i = 0; i < 5; i++){            
            list.add(sc.nextInt());
        }

        reverseArrayList(list);
        printArrayList(list);

        sc.close();
    }    
}
