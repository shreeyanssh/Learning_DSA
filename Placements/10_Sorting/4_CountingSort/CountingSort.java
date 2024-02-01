public class CountingSort {
    public static void countingSorting(int arr[]){
        int largestNumber = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            if(largestNumber < arr[i]){
                largestNumber = arr[i];
            }
        }

        int count[] = new int[largestNumber+1];

        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {3,5,2,6,7,9,1,4,8};
        countingSorting(arr);
        printArray(arr);
    }        
}
