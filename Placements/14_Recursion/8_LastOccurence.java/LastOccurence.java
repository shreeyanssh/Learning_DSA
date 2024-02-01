public class LastOccurence {
    public static int lastOccurence(int arr[], int i, int key){
        if(0 == i){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return lastOccurence(arr, i-1, key);
    }
    public static void main(String[] args){
        int arr[] = {3,5,6,1,4,6,7,8,9};
        int i = arr.length - 1;
        int key = 6;

        System.out.println(lastOccurence(arr, i, key));
    }    
}
