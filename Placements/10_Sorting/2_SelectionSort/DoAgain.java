public class DoAgain {
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int smallNoPosition = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[smallNoPosition]>arr[j]){
                    smallNoPosition = j;
                }
            }
            //swap
            int temp = arr[smallNoPosition];
            arr[smallNoPosition] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {1,5,8,3,4,6,2};
        selectionSort(arr);
        printArray(arr);
    }    
}
