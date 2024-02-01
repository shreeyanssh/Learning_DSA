public class FirstOccurence {
    public static int firstOccurence(int arr[], int i, int key){
        if(arr.length == i){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return firstOccurence(arr, i+1, key);
    }
    public static void main(String[] args){
        int arr[] = {3,5,6,1,4,6,7,8,9};
        int i = 0;
        int key = 6;

        System.out.println(firstOccurence(arr, i, key));
    }    
}
