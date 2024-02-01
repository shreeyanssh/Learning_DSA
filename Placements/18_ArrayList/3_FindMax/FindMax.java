import java.util.*;
public class FindMax {
    public static void findMax(ArrayList<Integer> list){
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > maxNum){
                maxNum = list.get(i);
            }
        }
        System.out.print("Max Num: " + maxNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Give any 5 numbers to compare: ");

        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }

        findMax(list);

        sc.close();
    }    
}
