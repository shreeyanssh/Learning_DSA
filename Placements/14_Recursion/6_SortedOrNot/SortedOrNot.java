public class SortedOrNot {
    public static boolean sortedOrNot(int anyArray[], int i){
        if(anyArray.length-1 == i){
            return true;
        }
        
        if(anyArray[i] > anyArray[i+1]){
            return false;
        }

        return sortedOrNot(anyArray, i+1);
    }
    public static void main(String[] args){
        int array[] = {1,2,3,4,5,6,8,9};
        int i = 0;
        if(sortedOrNot(array, i)){
            System.out.println("Its sorted.");
        }
        else{
            System.out.println("Its Unsorted.");
        }
    }
}
