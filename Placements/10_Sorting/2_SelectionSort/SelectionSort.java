public class SelectionSort{
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int smallNoPos = i;
            for(int j = i+1; j < arr.length-1; j++){
                if(arr[smallNoPos] > arr[j]){
                    smallNoPos = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[smallNoPos];
            arr[smallNoPos] = temp;
        }
             
        
    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {1,5,2,6,7,9,3,4,8};
        selectionSort(arr);
        printArray(arr);
    }
}